package com.github.shizuwei.test1.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 课程
 * 
 * @title Course
 * @desc 课程
 * @author shizuwei
 * @date 2016年4月20日
 * @version 1.0
 */
@Entity
@Table(name = "course", catalog = "libra")
@Data
public class Course {

	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String name;

	@Column(name="grade_id")
	private Integer gradeId;

	/**
	 * 课程类型ID 包括长期班,短期班等
	 */
	@Column(name="course_type_id")
	private Integer courseTypeId;

	/**
	 * 课程对应的科目
	 */
	@Column(name="subject_id")
	private Integer subjectId;
	@Column
	private Long price;
	@Column
	private Integer year;
	/**
	 * 季节 春季 1 夏季 2 秋季 3 冬季 4
	 */
	@Column
	private Integer season;
	@Column(name="lesson_count")
	private Integer lessonCount;
	/**
	 * 班级下面的课程数目，统计出来
	 */
	@Column(name="class_count")
	private Integer classCount;
	/**
	 * 允许退班=true(默认)，不允许=false
	 */
	@Column(name="allow_withdraw")
	private Boolean allowWithdraw;
	/**
	 * 转班次数限制
	 */
	@Column(name="trans_limit")
	private Integer transLimit;
 
	@Column(name="is_del")
	private Integer isDel;
	@Column(name="create_time")
	private Date createTime;
	@Column(name="update_time")
	private Date updateTime;
}
