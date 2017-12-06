package com.maven.release.manage.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maven.release.service.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService a;

	@RequestMapping("/index")
	public String showName() {
		return a.showName();

	}
}
