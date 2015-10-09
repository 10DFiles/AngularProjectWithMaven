package com.bd.AngularjsStudentCurd.Service;

import java.util.List;

import com.bd.AngularjsStudentCurd.Model.StudentCurdBean;

public interface StudentCurdServiceInterface {

	public StudentCurdBean SaveStudent(StudentCurdBean stuBean);

	public StudentCurdBean FindStudentById(int id);

	public void DeleteStudentById(int id);
	
	public int UpdateStudent(StudentCurdBean stuBean);
	
	public   List<StudentCurdBean> listStudent();
	
}
