package com.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Item;
import com.pojo.Question;
import com.pojo.Score;
import com.service.CourseService;
import com.service.QuestionService;
import com.service.ScoreService;
import com.service.ShijuanService;
import com.service.UserService;

@Controller
@RequestMapping("/score")
public class ScoreController {

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
	
	@RequestMapping("first")
	public String first() {
		return "admin/score/first";
	}
	
	@RequestMapping("selectkemu")
	public String selectkemu() {
		return "admin/score/selectkemu";
	}
	
	@RequestMapping("selectkemu1")
	public String selectkemu_1() {
		return "admin/score/selectkemu_1";
	}
	
	@RequestMapping("listScore")
	public String listScore(Model model,String courseID) {
	
        List<Score> scores = scoreService.queryAll(courseID);
        model.addAttribute("scores",scores);
        model.addAttribute("courseID",courseID);
		return "admin/score/listScore";
	}
	
	@RequestMapping("listScore1")
	public String listScore_1(Model model,String courseID) {
		 List<Score> scores = scoreService.queryAll(courseID);
		 List<Item> items = scoreService.queryAllFileds();
	     model.addAttribute("scores",scores);
	     model.addAttribute("items",items);
	     model.addAttribute("courseID",courseID);
		return "admin/score/listScore_1";
	}
	
	@RequestMapping("importExcel1")
	public void importExcel1(HttpServletRequest request,HttpServletResponse response,String courseID) throws Exception {
		response.setContentType("application/vnd.ms-excel");
		response.setCharacterEncoding("utf-8");
		response.setHeader("content-disposition","attachment;filename=data.xls");
		HSSFWorkbook wb = scoreService.getScoreWorkBook(courseID);
		ServletOutputStream out = response.getOutputStream();
		wb.write(out);
		out.close();
	}
	
	@RequestMapping("importExcel2")
	public void importExcel2(HttpServletResponse response,String[] fields,String courseID) throws Exception {
		response.setContentType("application/vnd.ms-excel");
		response.setCharacterEncoding("utf-8");
		response.setHeader("content-disposition", "attachment;filename=data.xls");
		ServletOutputStream out = response.getOutputStream();
		HSSFWorkbook wb = scoreService.getScoreWorkBookByFields(fields,courseID);
		wb.write(out);
		out.close();
		
	}
	
	@RequestMapping("updatescoredo")
	public String update_score_do(Model model,String courseID,String[] id,String[] pscj) {
  
		if(scoreService.Batchupdate(id, pscj)) {
			 model.addAttribute("msg","平时成绩修改成功");
		}else {
			 model.addAttribute("msg","平时成绩修改失败");
		}
		return "admin/score/update_score_do";
	}
	
	
}
