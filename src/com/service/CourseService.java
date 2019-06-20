package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.CourseMapper;
import com.pojo.Course;
import com.pojo.CourseExample;

@Service("courseService")
public class CourseService {

	@Resource
	private CourseMapper coursedao;
	
	public boolean del(String courseID) {
		return coursedao.deleteByPrimaryKey(courseID)==1;
	}
	
	public boolean add(Course course) {
		return coursedao.insertSelective(course)==1;
	}
	
	public boolean update(Course course) {
		return coursedao.updateByPrimaryKeySelective(course)==1;
	}
	
	 public Course getCourse(String courseID) {
		 return (Course) coursedao.selectByPrimaryKey(courseID);
	 }
	 
	 public boolean delete1(String courseID) {
		 return coursedao.deleteByPrimaryKey(courseID)==1;
	 }
	 
	 public List<Course> queryAll() {
		 CourseExample courseExample = new CourseExample();
		 courseExample.setDistinct(false);
		 courseExample.setOrderByClause("courseid asc");
		 return coursedao.selectByExample(courseExample);
	 }
}
