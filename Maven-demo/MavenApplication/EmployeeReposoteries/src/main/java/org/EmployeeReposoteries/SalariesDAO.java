package org.EmployeeReposoteries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SalariesDAO {

	public Salaries getEmployeeSalary(int id) {
		Salaries salaries = null;
		ResultSet rs =	null;
		PreparedStatement pStatement = null;
		Connection con = DataBaseConnection.getConnection();
		try {
			pStatement = con.prepareStatement("select sum(salary) as TotalSalary from salaries where emp_no=?");
			pStatement.setInt(1, id);
			rs = pStatement.executeQuery();
			while(rs.next()){
				salaries = new Salaries();
				salaries.setSalary(Double.parseDouble(rs.getString("TotalSalary")));
				//e = new Employee(Integer.parseInt(rs.getString("emp_no")), rs.getString("first_name"), rs.getString("last_name"), rs.getString("gender"));
			}
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return salaries;
	}

}
