package com.example.model;

public class ContractEmployee extends Employee{
	private int contractDuration;
	private double contractAmount;
	private static int count = 0;
	
	public ContractEmployee(String name,  double basicSalary,int contractDuration,double contractAmount) {
		super(name,basicSalary);
		this.contractAmount = contractAmount;
		this.contractDuration = contractDuration;
		count++;
		
	}
	
	public static int getCount() {
		return count;
	}
	
	
	@Override
	public double calculateSalary() {
		return this.contractAmount / this.contractDuration;
	}
	
	public void displayDetails() {
		System.out.println("******** Contract Employee ********");
		super.displayDetails();
	}

	
	public int getContractDuration() {
		return contractDuration;
	}
	
	public double getContractAmount() {
		return contractAmount;
	}
	
	
	

}
