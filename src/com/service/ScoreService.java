package com.service;



import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.stereotype.Service;

import com.mapper.ScoreMapper;
import com.pojo.Item;
import com.pojo.Score;
import com.pojo.ScoreExample;



@Service("scoreService")
public class ScoreService {

	@Resource
	private ScoreMapper scoredao;
	
	 public boolean Batchupdate(String id[], String pscj[]) {
		 
		 boolean flag = true;
		 for(int i=0;i<id.length;i++) {
			Score score = new Score();
			score.setPscj(Integer.parseInt(pscj[i]));
			score.setId(Integer.parseInt(id[i]));
			if( scoredao.Batchupdate(score)!=1) {
				flag = false;
			}
		 }
		 return flag;
	 }
	 
	 public boolean add(String userID,String courseID, int score) {
		 Score score1= new Score();
		 score1.setUserID(userID);
		 score1.setCourseID(courseID);
		 score1.setKscj(score);
		 return scoredao.insertSelective(score1)==1;
	 }
	 
	 public List<Score> queryAll(String courseID) {
		  ScoreExample scoreExample = new ScoreExample();
		  scoreExample.setDistinct(false);
		  scoreExample.setOrderByClause("id asc");
		  ScoreExample.Criteria criteria = scoreExample.createCriteria();
		  criteria.andCourseIDEqualTo(courseID);
		  return scoredao.selectByExample(scoreExample);  
	 }

	 public HSSFWorkbook getScoreWorkBook(String courseID) throws Exception {
		 HSSFWorkbook wb = new HSSFWorkbook();
		 Sheet sheet = wb.createSheet("sheet1");
		 String[] title = {"学号","姓名","考试成绩","平时成绩","总成绩"};
		 Row titleRow = sheet.createRow(0);
		 CellStyle style = wb.createCellStyle();
		 Cell cell = null;
		 
		 for(int i=0;i<title.length;i++) {
			 cell = titleRow.createCell(i);
			 cell.setCellValue(title[i]);
			 cell.setCellStyle(style);
		 }
		 Row row = null;
		 List<Score> list = scoredao.userAndscore(courseID);
		 for(int i=0;i<list.size();i++) {
			 row=sheet.createRow(i+1);
			 row.createCell(0).setCellValue(list.get(i).getUserID()==null?"":list.get(i).getUserID());
			 row.createCell(1).setCellValue(list.get(i).getUserName()==null?"":list.get(i).getUserName());
			 row.createCell(2).setCellValue(list.get(i).getKscj() == null?0:list.get(i).getKscj());
			 row.createCell(3).setCellValue(list.get(i).getPscj()==null?0:list.get(i).getPscj());
			 row.createCell(4).setCellValue(list.get(i).getCj()==null?0:list.get(i).getCj()); 
			
		 }
		 
		 for(int i=0;i<title.length;i++) {
			 sheet.autoSizeColumn(i,true);
			 sheet.setColumnWidth(i, sheet.getColumnWidth(i)*15/10);
		 }
		 
		 return wb;
	 }
	 
	 public HSSFWorkbook getScoreWorkBookByFields(String fields[],String courseID) throws Exception {
		 HSSFWorkbook wb = new HSSFWorkbook();
		 Sheet sheet = wb.createSheet("sheet1");
		 
		 String[] title = new String[fields.length];
		 for(int i=0;i<fields.length;i++) {
			 title[i]=fields[i];
		 }
		 Row titleRow = sheet.createRow(0);
		 CellStyle style = wb.createCellStyle();
		 Cell cell = null;
		 
		 for(int i=0;i<title.length;i++) {
			 cell = titleRow.createCell(i);
			 cell.setCellValue(title[i]);
			 cell.setCellStyle(style);
		 }
		 Row row = null;
		 ScoreExample scoreExample = new ScoreExample();
		 scoreExample.setDistinct(false);
		 scoreExample.setOrderByClause("id asc");
		 ScoreExample.Criteria criteria = scoreExample.createCriteria();
		 criteria.andCourseIDEqualTo(courseID);
		 List<Score> list = scoredao.selectByExample(scoreExample);
		 
		 StringBuilder stringBuilder = new StringBuilder();
		 for(String string : fields) {
			 stringBuilder.append(string);
		 }
		 
		 for(int i=0;i<list.size();i++) {
			 row=sheet.createRow(i+1);
			 int k=0;
			 if(stringBuilder.toString().contains("编号")) {
				 row.createCell(k++).setCellValue(list.get(i).getId()==null?i:list.get(i).getId());
			 }
			 if(stringBuilder.toString().contains("用户")) {
				 row.createCell(k++).setCellValue(list.get(i).getUserID()==null?"":list.get(i).getUserID());
			 }
			 if(stringBuilder.toString().contains("平时")) {
				 row.createCell(k++).setCellValue(list.get(i).getPscj()==null?0:list.get(i).getPscj());
			 }
			 if(stringBuilder.toString().contains("考试")) {
				 row.createCell(k++).setCellValue(list.get(i).getKscj() == null?0:list.get(i).getKscj());
			 }
			 if(stringBuilder.toString().contains("总成绩")) {
				 row.createCell(k++).setCellValue(list.get(i).getCj()==null?0:list.get(i).getCj()); 
			 }
			
		 }
		 
		 for(int i=0;i<title.length;i++) {
			 sheet.autoSizeColumn(i,true);
			 sheet.setColumnWidth(i, sheet.getColumnWidth(i)*15/10);
		 }
		 
		 return wb;
	 }
	 
	 public List<Item> queryAllFileds() {
	     List<Item> list= new ArrayList<>() ;
	     list.add(new Item("编号","编号"));
	     list.add(new Item("用户","用户编号"));
	     list.add(new Item("总成绩","总成绩"));
	     list.add(new Item("平时","平时成绩"));
	     list.add(new Item("考试","考试成绩"));
	    
	     
	     return list;
	 }
	 
	 public List<Score> listScore(String courseID){
		 return scoredao.listScore(courseID);
	 }
	 
	 
}
