package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Banji;
import com.pojo.Course;
import com.pojo.Question;
import com.pojo.Shijuan;
import com.service.BanjiService;
import com.service.CourseService;
import com.service.QuestionService;
import com.service.ScoreService;
import com.service.ShijuanService;
import com.service.UserService;
import com.sun.javafx.scene.layout.region.SliceSequenceConverter;

@Controller
@RequestMapping("/shijuan")
public class ShijuanController {

	@Resource(name="questionService")
	private QuestionService questionService;
	
	@Resource(name="userService")
	private UserService userService;
	
	@Resource(name="banjiService")
	private BanjiService banjiService;
	
	@Resource(name="shijuanService")
	private ShijuanService shijuanService;
	
	@Resource(name="scoreService")
	private ScoreService scoreService;
	
	@Resource(name="courseService")
	private CourseService courseService;
	
	@RequestMapping("first")
	public String first() {

		return "admin/shijuan/first";
	}
	
	@RequestMapping("selectBanjiAndKemu")
	public String selectBanjiAndKemu(Model model) {
		List<Banji> banjis = banjiService.ListAll();
		List<Course> courses=courseService.queryAll();
		List<Question> q = questionService.ListAll();
		model.addAttribute("banjis",banjis);
		model.addAttribute("courses",courses);
		model.addAttribute("q",q);
		return "admin/shijuan/selectBanjiAndKemu";
	}
	
	@RequestMapping("listALL")
	public String listALL(Model model) {
        List<Shijuan> list = shijuanService.ListAll();
        model.addAttribute("list",list);
		return "admin/shijuan/listALL";
	}
	
	@RequestMapping(value="check",produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String check(Model model,String status) {
		
	    String statusS[]=status.split(",");

	    boolean f = shijuanService.uptateByIdAndZhuangtai(statusS[1], statusS[0]);

	    if (f&&statusS[0].equals("start")) {
	    	return "考试开始";
	    } else if (f&&statusS[0].equals("end")){
	        return "考试结束";
	    }else {
	    	return "";
	    }
		
	}
	
	@RequestMapping(value="changebj")
	@ResponseBody
	public List<Banji> changebj(Model model,String xydh) {
	   List<Banji> b = banjiService.changebj(xydh);
	   
	   return b;
		
	}
	
	@RequestMapping("insert")
	public String insert(Model model,Shijuan shijuan,String[] selectFlag) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<selectFlag.length;i++) {
			stringBuilder.append(selectFlag[i]+",");
		}
		String timu = stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length()).toString();
		shijuan.setTimu(timu);
        if(shijuanService.add(shijuan)) {
        	model.addAttribute("msg","试卷增加成功");
        }else {
        	model.addAttribute("msg","试卷增加失败");
        }
		return "admin/shijuan/batchSelect";
	}
	
}

