package org.EmployeeReposoteries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DepartmentDAO {

	public Department getDepartment(int id) {
		Department department = null;
		ResultSet rs =	null;
		PreparedStatement pStatement = null;
		Connection con = DataBaseConnection.getConnection();
		try {
			pStatement = con.prepareStatement("select dept_no, dept_name from departments where dept_no in(select dept_no from dept_emp where emp_no = ?)");
			pStatement.setInt(1, id);
			rs = pStatement.executeQuery();
			while(rs.next()){
				department = new Department();
				department.setDept_no(rs.getString("dept_no"));
				department.setDept_name(rs.getString("dept_name"));
				//salaries.setSalary(Double.parseDouble(rs.getString("TotalSalary")));
				//e = new Employee(Integer.parseInt(rs.getString("emp_no")), rs.getString("first_name"), rs.getString("last_name"), rs.getString("gender"));
			}
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return department;
	}

}
