package com.github.shizuwei.controller.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.github.shizuwei.test1.service.TestService;

@Controller
public class TestController {
	@Resource
	private TestService testService;
	
	@RequestMapping("/test.json")
	@ResponseBody
	public void test() {
		testService.test();
	}
}
