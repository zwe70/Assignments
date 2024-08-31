package com.example.model;

public class Employee {
	private String name;
	private int employeeId;
	private double basicSalary;
	private static int count = 0 ;
	
	public Employee(String name,double basicSalary) {
		this.name= name;
		this.basicSalary = basicSalary;
		count++;
		this.employeeId = count;
		
	}
	
	public double calculateSalary() {
		return this.basicSalary;
	}
	
	public static int getCount() {
		return count;
	}
	
	public void displayDetails() {
//		System.out.print("\n*****" + this.getClass() + "*****");
		System.out.print("Employee Name : " + this.name);
		System.out.print("\nID : " + this.employeeId);
		System.out.print("\nBasic Salary : " + this.basicSalary);
		System.out.print("\nActual salary : " + this.calculateSalary() + "\n");
		System.out.println();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	

}
