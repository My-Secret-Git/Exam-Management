package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Course;
import com.pojo.Question;
import com.service.CourseService;
import com.service.QuestionService;
import com.service.ScoreService;
import com.service.ShijuanService;
import com.service.UserService;

@Controller
@RequestMapping("/course")  
public class CourseController {
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
	
	@RequestMapping("list")
	public String list(Model model) {
		
        List<Course> list = courseService.queryAll();
        model.addAttribute("list",list);
		return "admin/course/list";
	}
	
	@RequestMapping("insertpre")
	public String insertpre() {
		return "admin/course/insert";
	}
	
	@RequestMapping("insert")
	public String insert(Model model,Course question) {
		
		if(courseService.add(question)) {
      	  model.addAttribute("msg","课程添加成功");
      }else {
      	  model.addAttribute("msg","课程添加失败");
      }
		return "admin/course/insert_do";
	}
	
	@RequestMapping("del/{questionID}")
	public String del(Model model,@PathVariable("questionID") String questionID) {
        if(courseService.del(questionID)) {
        	  model.addAttribute("msg","课程删除成功");
        }else {
        	  model.addAttribute("msg","课程删除失败");
        }
      
		return "admin/course/delete";
	}
	
	@RequestMapping("updatepre/{questionID}")
	public String updatepre(Model model,@PathVariable String questionID) {
		Course course = courseService.getCourse(questionID);
        model.addAttribute("c",course);
		return "admin/course/update";
	}
	
	@RequestMapping("update")
	public String update(Model model,Course question) {
		if(courseService.update(question)) {
			model.addAttribute("msg","课程修改成功");
		}else {
			model.addAttribute("msg","课程修改失败");
		}
        
		return "admin/course/update_do";
	}
}
