package com.bd.AngularjsStudentCurd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bd.AngularjsStudentCurd.Model.StudentCurdBean;
import com.bd.AngularjsStudentCurd.Service.StudentCurdServiceInterface;

@RestController
@RequestMapping(value = "/find")
public class GetStudentDetails {

	@Autowired
	StudentCurdServiceInterface stuService;

	@RequestMapping(value = "/GetStudentDetails", method = RequestMethod.GET)
	public StudentCurdBean FindStudentById(
			@RequestParam("id") int id) {

		System.out.println("id"+id);

		StudentCurdBean h=this.stuService.FindStudentById(id);
		System.out.println("IN ConTreoller"+h);
		 return h;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init() {
		System.out.println("FindBYName");
		return "Service running successfully..!!";
	}

}
