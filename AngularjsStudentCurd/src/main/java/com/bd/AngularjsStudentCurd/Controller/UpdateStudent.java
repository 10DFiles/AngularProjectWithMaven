package com.bd.AngularjsStudentCurd.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bd.AngularjsStudentCurd.Model.StudentCurdBean;
import com.bd.AngularjsStudentCurd.Service.StudentCurdServiceInterface;

@RestController
@RequestMapping(value = "/update")
public class UpdateStudent {

	@Autowired
	StudentCurdServiceInterface stuService;

	@RequestMapping(value = "/UpdateStudentDetails", method = RequestMethod.POST, produces = "application/json")
	public int isupdateStudent(@RequestBody StudentCurdBean stubean) {
		/*
		 * System.out.println("Name" + stubean.getName());
		 * System.out.println("Id" + stubean.getId());
		 * System.out.println("Address" + stubean.getAddress());
		 * System.out.println("Mark" + stubean.getMark());
		 */
		return this.stuService.UpdateStudent(stubean);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init() {
		System.out.println("Service");
		return "Service running successfully..!!";
	}
}
