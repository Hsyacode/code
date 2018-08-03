package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

import com.example.entity.People;

@Controller
public class MyController {

	@RequestMapping
	public void test(HttpServletRequest request){
		DispatcherServlet ds = new DispatcherServlet();
		HashSet<People> hs = new HashSet<People>();
		List<People> list = new ArrayList<People>();
		Map<String, Object> map = new HashMap<String, Object>();
	}
	
}
