package org.EmployeeApplication;

import org.EmployeeService.beans.*;
import org.EmployeeService.EmployeeService;
import org.EmployeeService.EmployeeServiceImpl;

public class EmployeeApplication {
	
	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		EmployeeDetails employeeDetails=employeeService.getEmployeeInformation();
		System.out.println(employeeDetails);
	}

}
