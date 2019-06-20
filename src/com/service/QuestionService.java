package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.springframework.stereotype.Service;

import com.mapper.QuestionMapper;
import com.pojo.Question;
import com.pojo.QuestionExample;

@Service("questionService")
public class QuestionService {

		@Resource
		private QuestionMapper questiondao;
		
		public boolean del(int questionID) {
			return questiondao.deleteByPrimaryKey(questionID)==1;
		}
		
		public boolean add(Question question) {
			return questiondao.insertSelective(question)==1;
		}
		
		public void importQuestionFromXML(String fileName) throws Exception {
	        SAXBuilder sb = new SAXBuilder();
	        Document doc = sb.build(fileName); 
	        Element root = doc.getRootElement(); 
	        List list = root.getChildren("record");

	        for (int i = 0; i < list.size(); i++) {
	            Element element = (Element) list.get(i);

	            String s = element.getChildText("subject").replaceAll("\n", "<br />");//取disk子元素capacity的内容
	            //System.out.println(s);
	            String a = element.getChildText("choiceA");
	            String b = element.getChildText("choiceB");
	            String c = element.getChildText("choiceC");
	            String d = element.getChildText("choiceD");
	            String answer = element.getChildText("answer");
	           
	            add(new Question(s, a, b, c, d, answer, "01", "01"));
	        }
	    }
		
		public boolean update(Question question) {
			return questiondao.updateByPrimaryKeySelective(question)==1;
		}
		
		public Question queryByQuestionId(int id) {
			return (Question)questiondao.selectByPrimaryKey(id);
		}
		
		
		public Question DuobiaoqueryByQuestionId(int id) {
			 return questiondao.DuobiaoqueryByQuestionId(id);
		}
		
		public List<Question> ListAll() {
			QuestionExample questionExample = new QuestionExample();
			questionExample.setDistinct(false);
			questionExample.setOrderByClause("questionID asc");
			return questiondao.selectByExample(questionExample);
		}
		
		 public List<Question> queryBycourseID(String courseID) {
			 QuestionExample questionExample = new QuestionExample();
			 questionExample.setDistinct(false);
			 questionExample.setOrderByClause("questionID asc");
			 QuestionExample.Criteria criteria = questionExample.createCriteria();
			 criteria.andCourseIDEqualTo(courseID);
			 return questiondao.selectByExample(questionExample);
		 }
		 
		 public List<Question> queryByLike(String keyword) {
			 keyword = "%"+keyword+"%";
			 return questiondao.queryByLikeBychoice(keyword);
					 
		 }
		 
		 public List<Question> queryByLike(int pageNO) {
			 return questiondao.queryByLikeBypage( (pageNO-1)*5 );
		 }
		 
		 public List<Question> queryByLike(String keyword, int pageNO) {
			 return questiondao.queryByLikeByall("%"+keyword+"%",(pageNO-1)*7 );
		 }
		 
		 public int getTotalPage() {
			 return questiondao.getTotalPage()%5==0?questiondao.getTotalPage()/5:(questiondao.getTotalPage()/5+1);
		 }
		
		 public int getTotalPage(String cond) {
			 return questiondao.getTotalPageBychoice("%"+cond+"%");
		 }
		 
		 public boolean batchDeleteQuestion(String[]  ids)  {
			 boolean flag = true;
			 for(int i=0;i<ids.length;i++) {
				 if(questiondao.deleteByPrimaryKey(Integer.parseInt(ids[i]))!=1) {
					 flag=false;
				 }
			 }
				 
			 return flag;
		 }
		 
		 public List<Question> queryByShijuan(String shijuantimu) {
			 List<String> list= new ArrayList<>();
			 try {
				 String[] s = shijuantimu.split(",");
				 for(String ss :s) {
					 list.add(ss);
				 }
			} catch (Exception e) {
				list.add(shijuantimu);
			}

			 return questiondao.queryByShijuan(list);
			
			 
		 }
		
}
