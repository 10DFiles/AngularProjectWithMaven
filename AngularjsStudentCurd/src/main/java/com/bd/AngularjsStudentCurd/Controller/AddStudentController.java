package com.bd.AngularjsStudentCurd.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.bd.AngularjsStudentCurd.Model.StudentCurdBean;
import com.bd.AngularjsStudentCurd.Service.StudentCurdServiceInterface;

@RestController
@RequestMapping(value = "/student")
public class AddStudentController {

	
	@Autowired
	 StudentCurdServiceInterface stuService;

	@RequestMapping(value = "/AddStudentDetails", method = RequestMethod.POST, produces="application/json")
	public StudentCurdBean isAddStudent(@RequestBody StudentCurdBean stubean) {

		System.out.println("Name-" + stubean.getName());
		/*System.out.println("Id-" + stubean.getId());*/
		System.out.println("Address-" + stubean.getAddress());
		System.out.println("Mark-" + stubean.getMark());
		System.out.println("StudentID-" + stubean.getStudentID());

		return this.stuService.SaveStudent(stubean);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init() {
		
		return "index";
	}

}
