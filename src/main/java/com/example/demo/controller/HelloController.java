package com.example.demo.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller  
public class HelloController {
//	@RequestMapping(value="/{reader}", method=RequestMethod.GET)
//	public String readersBooks(@PathVariable("reader") String reader,Model model) {
//		System.out.println("123="+reader);
//		return "index";
//	}
	@Value("${application.hell:Hello Shanhy}")
    private String hello = "Hello Shanhy";
	
	@RequestMapping(value = {"/","/index"})
    public String index(Map<String, Object> model){
        // 直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
        // 本例为 /WEB-INF/jsp/index.jsp
		System.out.println("123=index");
        model.put("time", new Date());
        model.put("message", this.hello);
        return "index";
    } 
}
