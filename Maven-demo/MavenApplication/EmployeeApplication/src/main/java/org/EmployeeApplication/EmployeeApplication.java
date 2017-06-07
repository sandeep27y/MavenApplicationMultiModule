package org.EmployeeApplication;

import org.EmployeeReposoteries.EmployeeDetails;
import org.EmployeeService.EmployeeService;

public class EmployeeApplication {
	
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		EmployeeDetails employeeDetails=employeeService.getEmployeeInformation();
		System.out.println(employeeDetails);
	}

}
