package com.bd.AngularjsStudentCurd.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "StudentCurdBean", schema = "studentCurdAdmin")
@JsonIgnoreProperties(ignoreUnknown=true)
public class StudentCurdBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private Long studentID;
	private String userName;
	private String password;
	private String name;
	private String address;
	
	

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	public Long getStudentID() {
		return studentID;
	}
	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMark() {
	
		System.out.println("mark in bean class"+ mark);
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	private String mark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
