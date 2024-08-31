package mainApp;
import java.io.IOException;

import com.example.model.Employee;
import com.example.service.EmployeeRegistrationService;

public class MainTest {
	public static void main(String args[]) throws IOException {
		EmployeeRegistrationService service = new EmployeeRegistrationService();
		service.getEmployeesInfo();
		 for(int i= 0; i < Employee.getCount();i++) {
			 service.employeeDB[i].displayDetails();
		 }
		
		
	}

}
