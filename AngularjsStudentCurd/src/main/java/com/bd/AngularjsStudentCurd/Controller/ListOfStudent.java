package com.bd.AngularjsStudentCurd.Controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bd.AngularjsStudentCurd.Model.StudentCurdBean;
import com.bd.AngularjsStudentCurd.Service.StudentCurdServiceInterface;

@RestController
@RequestMapping(value = "/list")
public class ListOfStudent {

	@Autowired
	StudentCurdServiceInterface stuService;

	List<StudentCurdBean> listArray;

	@RequestMapping(value = "/listOfStudent", method = RequestMethod.GET)
	public List<StudentCurdBean> listStudent() {

		return this.stuService.listStudent();
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init() {
		
		return "index";
	}


}
