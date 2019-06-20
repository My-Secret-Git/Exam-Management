package com.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Course;
import com.pojo.Question;
import com.pojo.Score;
import com.pojo.Shijuan;
import com.pojo.User;
import com.service.CourseService;
import com.service.QuestionService;
import com.service.ScoreService;
import com.service.ShijuanService;
import com.service.UserService;

@Controller
@RequestMapping("/exam")
public class ExamController {

	@Resource(name="questionService")
	private QuestionService questionService;
	
	@Resource(name="userService")
	private UserService userService;
	
	@Resource(name="shijuanService")
	private ShijuanService shijuanService;
	
	@Resource(name="scoreService")
	private ScoreService scoreService;
	
	@Resource(name="courseService")
	private CourseService courseService;
	
	@RequestMapping("plan")
	public String plan(Model model,HttpServletRequest request) {
			HttpSession session = request.getSession();
		    String userID=(String)session.getAttribute("userID");
		    String bjdh=userService.querybjdhByUserID(userID);
		    Shijuan shijuan= shijuanService.queryTimuBybjdh(bjdh);
		    if(shijuan==null){
			   model.addAttribute("mes", "对不起,考试没开始");
		   }
		   String shijuantimu=shijuan.getTimu();
		   String courseID=shijuan.getCourseID();
		   model.addAttribute("shijuanmingcheng", shijuan.getShijuanmingcheng());
		   model.addAttribute("shijuantimu", shijuantimu);
		   model.addAttribute("courseID", courseID);
		   List<Question> all=questionService.queryByShijuan(shijuantimu); 
		   model.addAttribute("all", all);
		return "user/exam/exam";
	}
	
	@RequestMapping("score")
	public String score(String shijuantimu,String courseID,HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		List<Question> all=questionService.queryByShijuan(shijuantimu);           
		String studentAnswer[]=new String[all.size()];
		for(int i=1;i<=all.size();i++){
		   studentAnswer[i-1]=request.getParameter(i+"");
		}
		int score1=0;
		int correctNumber=0;//存放我们做的正确答案数
		int j=0;
		for(Question q:all){
		if(q.getAnswer().equals(studentAnswer[j])){
		  correctNumber++;
		}
		j++;
		}
		score1=correctNumber*10;
		model.addAttribute("score1",score1);
		String userID=(String)session.getAttribute("userID");
		scoreService.add(userID, courseID, score1);
		return "user/exam/getScore";
	}
	
	@RequestMapping("selectExcecise")
	public String selectExcecise(Model model,HttpServletRequest request) {
		 	HttpSession session = request.getSession();
	        String username=(String)session.getAttribute("userName");
	        model.addAttribute("username",username);   
	        List<Course> categores=courseService.queryAll();
	        model.addAttribute("categores",categores);
		return "user/exercise/selectExcecise";
	}
	
	@RequestMapping("excecise")
	public String excecise(Model model,String courseID) {
	    List<Question> all=questionService.queryBycourseID(courseID); 
	    model.addAttribute("all",all);
	    model.addAttribute("courseID",courseID);
		return "user/exercise/excecise";
	}
	
	@RequestMapping("getscore")
	public String getscore(String courseID,HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		List<Question> all = questionService.queryBycourseID(courseID);
		String studentAnswer[] = new String[all.size()];
		
		for (int i = 1; i <= all.size(); i++) {
			studentAnswer[i - 1] = request.getParameter(i + "");
		}
	
		int score1 = 0;
		int correctNumber = 0;//存放我们做的正确答案数
		int j = 0;
		for (Question q : all) {
			if (q.getAnswer().equals(studentAnswer[j])) {
				correctNumber++;
			}
			j++;
		}

		score1 = correctNumber * 10;
		model.addAttribute("score1",score1);

		String userID=(String)session.getAttribute("userID");
		scoreService.add(userID, courseID, score1);
	
		return "user/exercise/getScore";
	}
	
	@RequestMapping("passwordpre")
	public String passwordpre() {
		return "user/password/modifypasswordfirst";
	}
	
	@RequestMapping("uploadpre")
	public String uploadpre() {
		return "user/upload/upload";
	}
	
	@RequestMapping("password")
	public String password(Model model,String pw,String password1,HttpServletRequest request) throws NoSuchAlgorithmException {
		    HttpSession session = request.getSession();
  
	        String pw2=(String)session.getAttribute("pw");
	        if(!pw.equals(pw2)){
	           model.addAttribute("mes","原密码错误");   
	           return "user/password/modifypasswordsecond";
	        }
	        
	        String userID=(String)session.getAttribute("userID");

	        if(userService.updatePassword(userID, password1)){ 
	        	session.setAttribute("pw",password1);
	        	model.addAttribute("mes","修改密码成功"); 
	        }else{
	        	model.addAttribute("mes","修改密码失败"); 
	        }
	       
	      
		return "user/password/modifypasswordsecond";
	}
	
	
	@RequestMapping("listScore")
	public String listScore(Model model,HttpServletRequest request) throws NoSuchAlgorithmException {
	    HttpSession session = request.getSession();
        String uid=(String)session.getAttribute("userID");
  
           List<Score> list = scoreService.listScore(uid);
           model.addAttribute("list",list);
		   return "user/listScore";
	}
	
	@RequestMapping("userDetail")
	public String userDetail(Model model,HttpServletRequest request) throws NoSuchAlgorithmException {
	    HttpSession session = request.getSession();
        String uid=(String)session.getAttribute("userID");
  
         User user = userService.queryByUserID(uid); 
           model.addAttribute("user",user);
		   return "user/upload/userDetail";
	}
	
	@RequestMapping("passwordpre1")
	public String passwordpre1() {
		return "admin/password/modifypasswordfirst";
	}
	
	@RequestMapping("password1")
	public String password1(Model model,String pw,String password1,HttpServletRequest request) throws NoSuchAlgorithmException {
		    HttpSession session = request.getSession();
  
	        String pw2=(String)session.getAttribute("pw");
	        if(!pw.equals(pw2)){
	           model.addAttribute("mes","原密码错误");   
	           return "admin/password/modifypasswordsecond";
	        }
	        
	        String userID=(String)session.getAttribute("userID");

	        if(userService.updatePassword(userID, password1)){ 
	        	session.setAttribute("pw",password1);
	        	model.addAttribute("mes","修改密码成功"); 
	        }else{
	        	model.addAttribute("mes","修改密码失败"); 
	        }
	       
	      
		return "admin/password/modifypasswordsecond";
	}
}
