package com.staticblock;

public class Employee {
	private static int empId;
	private String empName;
	private double empSal;
	private static double pfPercentage;
	
	static {
		empId=100;
		pfPercentage=12;
	}
	
	public Employee(String empName,double empSal){
		empId++;
		this.empName=empName;
		this.empSal=empSal;
	}

	public static int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public static double getPfPercentage() {
		return pfPercentage;
	}

	
	

}
