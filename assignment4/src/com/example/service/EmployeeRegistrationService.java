package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.ContractEmployee;
import com.example.model.Employee;
import com.example.model.FullTimeEmployee;
import com.example.model.PartTimeEmployee;

public class EmployeeRegistrationService {
	public Employee[] employeeDB = new Employee[1000];
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private String name;
	private double basicSalary;
	private String type;
	
	public void getEmployeesInfo() throws IOException {
		String flag;
		do {
		this.commonEmpInfo();
		if("contract".equalsIgnoreCase(this.type)) {
			employeeDB[Employee.getCount()] = this.getContractEmpInfo();
			
		}
		else if("fulltime".equalsIgnoreCase(this.type)) {
			employeeDB[Employee.getCount()] = this.getFullTimeEmpInfo();
		}
		else if("parttime".equalsIgnoreCase(this.type)) {
			employeeDB[Employee.getCount()] =  this.getPartTimeEmpInfo();
		}
		System.out.println("Do you want to add new Employee : (Yes / No )");
		flag = br.readLine();
		}
		while(flag.equalsIgnoreCase("yes"));
		
	}
	
	
	
	
		public void commonEmpInfo() throws IOException {
			System.out.println("Enter Employee name : ");
			this.name = br.readLine();
			
			System.out.println("Enter Emloyee Basic Salary : ");
			this.basicSalary = Double.parseDouble(br.readLine());
			
			System.out.println("Enter Employee Type(Contract / FulTime / PartTime) : ");
			this.type = br.readLine();
		}
	
	
		public ContractEmployee getContractEmpInfo() throws IOException{
			System.out.println("Enter contract duration : ");
			int duration = Integer.parseInt(br.readLine());
			System.out.println("Enter Contract amount : ");
			Double amount = Double.parseDouble(br.readLine());
			
			ContractEmployee contractEmp = new ContractEmployee(this.name, this.basicSalary, duration, amount);
			return contractEmp;
		
		
	}
		
		public FullTimeEmployee getFullTimeEmpInfo() throws IOException{
			System.out.println("Enter allowance : ");
			Double allowance = Double.parseDouble(br.readLine());
			System.out.println("Enter bonus : ");
			Double bonus = Double.parseDouble(br.readLine());
			
			FullTimeEmployee fullTimeEmp = new FullTimeEmployee(this.name,this.basicSalary,allowance,bonus);
			return fullTimeEmp;
		}
		
		public PartTimeEmployee getPartTimeEmpInfo() throws IOException{
			System.out.println("Enter Hours Worked : ");
			int hoursWorked = Integer.parseInt(br.readLine());
			System.out.println("Enter Hourly rate : ");
			Double hourlyRate = Double.parseDouble(br.readLine());
			
			PartTimeEmployee partTimeEmp = new PartTimeEmployee(this.name,this.basicSalary,hoursWorked,hourlyRate);
			return partTimeEmp;
		}
	

}
