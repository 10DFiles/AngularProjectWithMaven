package com.bd.AngularjsStudentCurd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bd.AngularjsStudentCurd.Service.StudentCurdServiceInterface;

@RestController
@RequestMapping(value = "/delete")
public class DeleteStudent {
	@Autowired
	StudentCurdServiceInterface stuService;

	@RequestMapping(value = "/DeleteStudentById", method = RequestMethod.GET)
	public void DeleteStudentById(@RequestParam("id") int id) {

		System.out.println("Student to delete");
		
		this.stuService.DeleteStudentById(id);

	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init() {
		System.out.println("hillo");
		return "Service running successfully..!!";
	}

}
