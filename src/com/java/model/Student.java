package com.java.model;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private int studentId;
	private String studentName;
	private String studentClass;
	
public Student()
{
	
}
	public Student(int studentId,String studentName,String studentClass)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentClass=studentClass;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	
	public String toString()
	{
		return this.studentName;
	}
	
	
//private String userId;
//private String firstName;
//private String lastName;
//private String gender;
//private Date dob;
//private String phone;
//private String email;
//private String password;
//private int studentAddress;
//public String getUserId() {
//	return userId;
//}
//public void setUserId(String userId) {
//	this.userId = userId;
//}
//public String getFirstName() {
//	return firstName;
//}
//public void setFirstName(String firstName) {
//	this.firstName = firstName;
//}
//public String getLastName() {
//	return lastName;
//}
//public void setLastName(String lastName) {
//	this.lastName = lastName;
//}
//public String getGender() {
//	return gender;
//}
//public void setGender(String gender) {
//	this.gender = gender;
//}
//public Date getDob() {
//	return dob;
//}
//public void setDob(Date dob) {
//	this.dob = dob;
//}
//public String getPhone() {
//	return phone;
//}
//public void setPhone(String phone) {
//	this.phone = phone;
//}
//public String getEmail() {
//	return email;
//}
//public void setEmail(String email) {
//	this.email = email;
//}
//public String getPassword() {
//	return password;
//}
//public void setPassword(String password) {
//	this.password = password;
//}
//public int getStudentAddress() {
//	return studentAddress;
//}
//public void setStudentAddress(int studentAddress) {
//	this.studentAddress = studentAddress;
//}



}
