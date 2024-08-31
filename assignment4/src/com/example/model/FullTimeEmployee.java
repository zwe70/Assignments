package com.example.model;

public class FullTimeEmployee extends Employee{
	private double allowance;
	private double bonus;
	private static int count = 0;
	
	public FullTimeEmployee(String name,double basicSalary,double allowance
			,double bonus) {
		super(name,  basicSalary);
		this.allowance = allowance;
		this.bonus = bonus;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	@Override
	public double calculateSalary() {
		 return this.allowance + this.bonus + this.getBasicSalary();
	}
	
	public void displayDetails() {
		System.out.println("******** Full Time employee ********");
		super.displayDetails();
	}
	

	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	;
	
	
}
