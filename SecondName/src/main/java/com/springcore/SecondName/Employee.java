package com.springcore.SecondName;

public class Employee {
	private String EmployeeName;
	private String EmployeeAddress;
	private int EmployeeId;
	private String EmployeePosition;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String employeeName, String employeeAddress, int employeeId, String employeePosition) {
		super();
		EmployeeName = employeeName;
		EmployeeAddress = employeeAddress;
		EmployeeId = employeeId;
		EmployeePosition = employeePosition;
	}


	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeAddress=" + EmployeeAddress + ", EmployeeId="
				+ EmployeeId + ", EmployeePosition=" + EmployeePosition + "]";
	}


	public String getEmployeeName() {
		return EmployeeName;
	}


	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}


	public String getEmployeeAddress() {
		return EmployeeAddress;
	}


	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}


	public int getEmployeeId() {
		return EmployeeId;
	}


	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}


	public String getEmployeePosition() {
		return EmployeePosition;
	}


	public void setEmployeePosition(String employeePosition) {
		EmployeePosition = employeePosition;
	}
}
