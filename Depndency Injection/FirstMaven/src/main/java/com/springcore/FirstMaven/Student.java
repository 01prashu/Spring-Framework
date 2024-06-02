package com.springcore.FirstMaven;

public class Student {
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String StudentName;
	private String StudentAddress;
	private int StudentId;
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	
	
	public Student(String s_name, String s_address, int s_id)
	{
		this.StudentName=s_name;
		this.StudentAddress=s_address;
		this.StudentId = s_id;
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentAddress=" + StudentAddress + ", StudentId=" + StudentId
				+ "]";
	}
	
}
