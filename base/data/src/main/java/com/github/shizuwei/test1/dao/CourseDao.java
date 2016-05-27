package com.github.shizuwei.test1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.shizuwei.test1.po.Course;

public interface CourseDao extends JpaRepository<Course,Integer>{
}
