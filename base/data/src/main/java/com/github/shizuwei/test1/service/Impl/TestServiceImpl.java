package com.github.shizuwei.test1.service.Impl;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.shizuwei.test1.dao.CourseDao;
import com.github.shizuwei.test1.po.Course;
import com.github.shizuwei.test1.service.TestService;

@Service(value = "testService")
@Slf4j
public class TestServiceImpl implements TestService{
	@Autowired
	private CourseDao courseDao;

	@Override
	@Transactional
	public void test() {
		Course course = courseDao.getOne(1);
		log.info("course={}", course);
		course.setId(null);
		course.setName("休息休息");
		course = courseDao.saveAndFlush(course);
		log.info("course={}", course);
		List<Course> list = courseDao.findAll();
		log.info("list={}", list);
	}
}
