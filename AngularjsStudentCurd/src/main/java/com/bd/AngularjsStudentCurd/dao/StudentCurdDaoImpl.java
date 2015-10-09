package com.bd.AngularjsStudentCurd.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bd.AngularjsStudentCurd.Model.StudentCurdBean;
import com.bd.AngularjsStudentCurd.Repository.StudentCurdRepository;

@Repository
public class StudentCurdDaoImpl implements StudentCurdDaoInterface {

	@Autowired
	StudentCurdRepository stuRepository;

	public StudentCurdBean SaveStudent(StudentCurdBean stuBean) {
		return stuRepository.save(stuBean);

	}

	public int UpdateStudent(StudentCurdBean stuBean) {

		System.out.println("Name" + stuBean.getName());
		System.out.println("Id" + stuBean.getId());
		System.out.println("Address" + stuBean.getAddress());
		System.out.println("Mark" + stuBean.getMark());
		System.out.println("StudentID" + stuBean.getStudentID());

		return stuRepository.UpdateStudent(stuBean.getName(),
				stuBean.getAddress(), stuBean.getMark(), stuBean.getId(),
				stuBean.getStudentID());
	}

	public List<StudentCurdBean> listStudent() {

		return this.stuRepository.findAll();
	}

	public void DeleteStudentById(int id) {
		this.stuRepository.DeleteStudentById(id);

	}

	public StudentCurdBean FindStudentById(int id) {
		StudentCurdBean j;

		j = this.stuRepository.FindStudentById(id);

		System.out.println("IN Service" + j);
		return j;
	}

}
