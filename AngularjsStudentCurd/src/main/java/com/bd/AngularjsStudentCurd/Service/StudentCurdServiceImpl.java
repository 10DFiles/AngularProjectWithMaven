package com.bd.AngularjsStudentCurd.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bd.AngularjsStudentCurd.Model.StudentCurdBean;
import com.bd.AngularjsStudentCurd.dao.StudentCurdDaoInterface;

@Service
@Transactional
public class StudentCurdServiceImpl implements StudentCurdServiceInterface {

	@Autowired
	StudentCurdDaoInterface stuDaoInterface;

	@Transactional
	public StudentCurdBean SaveStudent(StudentCurdBean stuBean) {
		return this.stuDaoInterface.SaveStudent(stuBean);
	}

	public int UpdateStudent(StudentCurdBean stuBean) {

		return this.stuDaoInterface.UpdateStudent(stuBean);
	}

	public List<StudentCurdBean> listStudent() {

		return this.stuDaoInterface.listStudent();
	}

	public void DeleteStudentById(int id) {
		this.stuDaoInterface.DeleteStudentById(id);

	}

	public StudentCurdBean FindStudentById(int id) {

		return this.stuDaoInterface.FindStudentById(id);
	}

}
