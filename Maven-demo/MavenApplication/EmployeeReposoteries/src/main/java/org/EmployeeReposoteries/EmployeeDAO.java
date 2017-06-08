package org.EmployeeReposoteries;

import org.EmployeeReposoteries.beans.Department;
import org.EmployeeReposoteries.beans.Employee;
import org.EmployeeReposoteries.beans.Salaries;

public interface EmployeeDAO {
	public Department getDepartment(int id);
	public Employee getEmployee(int id);
	public Salaries getEmployeeSalary(int id);
}
