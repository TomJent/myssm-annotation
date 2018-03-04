package com.myssm.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myssm.entity.Student;
import com.myssm.service.IStudentService;

@Controller
@RequestMapping("/test")
public class StudentController {

	@Autowired
	@Qualifier("studentService")
	//@Resource(name="studentService")
	private IStudentService service;

	public void setService(IStudentService service) {
		this.service = service;
	}

	@RequestMapping("/register.do")
	public String doRegister(String name, int age) {
		Student student = new Student(name, age);
		service.addStudent(student);
		return "/welcome.jsp";
	}

}
