package com.example.model;

public class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double hourlyRate;
	private static int count = 0;
	
	public PartTimeEmployee(String name,  double basicSalary
			,int hoursWorked,double hourlyRate) {
		super(name, basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		count++;
		
	}
	
	public double calculateSalary() {
		return this.hoursWorked * this.hourlyRate;
	}
	
	
	public static int getCount() {
		return count ;
	}
	
	public void displayDetails() {
		System.out.println("******** Part Time employee ********");
		super.displayDetails();
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}

	
	

}
