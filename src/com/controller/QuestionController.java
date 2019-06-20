package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Course;
import com.pojo.Question;
import com.service.CourseService;
import com.service.QuestionService;
import com.service.ScoreService;
import com.service.ShijuanService;
import com.service.UserService;

@Controller
@RequestMapping("/question")
public class QuestionController {

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
		
        List<Question> list = questionService.ListAll();
        model.addAttribute("list",list);
		return "admin/question/listALL";
	}
	
	@RequestMapping("listALL")
	public String listALL() {
		return "admin/question/list";
	}
	
	@RequestMapping("insertpre")
	public String insertpre(Model model) {
		List<Course> list = courseService.queryAll();
		model.addAttribute("categores",list);
		return "admin/question/insert";
	}
	
	@RequestMapping("insert")
	public String insert(Model model,Question question) {
		
		if(questionService.add(question)) {
      	  model.addAttribute("msg","试题添加成功");
      }else {
      	  model.addAttribute("msg","试题添加失败");
      }
		return "admin/question/insert_do";
	}
	
	@RequestMapping("del/{questionID}")
	public String del(Model model,@PathVariable("questionID") String questionID) {
        if(questionService.del(Integer.parseInt(questionID))) {
        	  model.addAttribute("msg","试题删除成功");
        }else {
        	  model.addAttribute("msg","试题删除失败");
        }
      
		return "admin/question/delete";
	}
	
	@RequestMapping("updatepre/{questionID}")
	public String updatepre(Model model,@PathVariable String questionID) {
		Question question = questionService.queryByQuestionId(Integer.parseInt(questionID));
		model.addAttribute("q",question);
        List<Course> categores=courseService.queryAll();
        model.addAttribute("categores",categores);
		return "admin/question/update";
	}
	
	@RequestMapping("update")
	public String update(Model model,Question question) {
		if(questionService.update(question)) {
			model.addAttribute("msg","试题修改成功");
		}else {
			model.addAttribute("msg","试题修改失败");
		}
        
		return "admin/question/update_do";
	}
	
	@RequestMapping("batchDelete")
	public String batchDelete(Model model) {
		List<Question> list = questionService.ListAll();
        model.addAttribute("questions",list);
		return "admin/question/batchDelete/list_Questions";
	}
	
	
	@RequestMapping("batchdel")
	public String batchdel(String[] selectFlag,Model model) {
		if(questionService.batchDeleteQuestion(selectFlag)) {
			model.addAttribute("msg","试题删除成功");
		}else {
			model.addAttribute("msg","试题删除失败");
		}
		return "admin/question/batchDelete/batchSelect";
	}
}
