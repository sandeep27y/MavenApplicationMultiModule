package org.EmployeeService;

import java.util.Scanner;

import org.EmployeeReposoteries.Department;
import org.EmployeeReposoteries.DepartmentDAO;
import org.EmployeeReposoteries.Employee;
import org.EmployeeReposoteries.EmployeeDAO;
import org.EmployeeReposoteries.EmployeeDetails;
import org.EmployeeReposoteries.Salaries;
import org.EmployeeReposoteries.SalariesDAO;

public class EmployeeService {
	
	public EmployeeDetails getEmployeeInformation(){
		EmployeeDAO employeeDAO = new EmployeeDAO();
		SalariesDAO salariesDAO = new SalariesDAO();
		DepartmentDAO departmentDAO = new DepartmentDAO();
		EmployeeDetails employeeDetails = new EmployeeDetails();
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the Employee ID");
		int id = scn.nextInt();
		Employee employee = employeeDAO.getEmployee(id);
		Salaries salaries = salariesDAO.getEmployeeSalary(id);
		Department department = departmentDAO.getDepartment(id);
		employeeDetails.setEmp_no(employee.getEmp_no());
		employeeDetails.setFirst_name(employee.getFirst_name());
		employeeDetails.setLast_name(employee.getLast_name());
		employeeDetails.setGender(employee.getGender());
		employeeDetails.setDept_no(department.getDept_no());
		employeeDetails.setDept_name(department.getDept_name());
		employeeDetails.setTotal_salary(salaries.getSalary());
		return employeeDetails;
	}

}
