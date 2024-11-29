package com.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.emp.exceptions.EmplyeeDAOException;
import com.emp.model.Employee;

public class EmployeeDAO {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";

	// Database credentials
	static final String USER = "system";
	static final String PASS = "admin";

	Connection con = null;

	public Connection getConnection() throws EmplyeeDAOException {
		try {
			if (con == null) {
				Class.forName(JDBC_DRIVER);
				con = DriverManager.getConnection(DB_URL, USER, PASS);
			} else {
				return con;
			}
		} catch (ClassNotFoundException e) {
			throw new EmplyeeDAOException("Not able to Create DB Connection", e);
		} catch (SQLException e) {
			throw new EmplyeeDAOException("Not able to Create DB Connection", e);
		}
		System.out.println("Creating Connection");
		return con;
	}

	public Statement getStatement(Connection con) throws EmplyeeDAOException {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			throw new EmplyeeDAOException("Not able to Create Statement", e);
		}
		return stmt;
	}

	public int insertEmployee(Employee emp) throws EmplyeeDAOException {
		Connection con = getConnection();

		Statement stmt = getStatement(con);

		String insertDataQuery = "INSERT INTO EMP VALUES(" + emp.getEmpId() + ", '" + emp.getEmpName() + "', "
				+ emp.getSalary() + ", '" + emp.getAddress() + "', " + emp.getMobileNo() + " )";
		int result = 0;
		try {
			result = stmt.executeUpdate(insertDataQuery);
		} catch (SQLException e) {
			throw new EmplyeeDAOException("Not able to Create Employee table", e);
		}
		return result;
	}

	public String updateEmployee(Employee emp) throws EmplyeeDAOException {
		String msg = "SUCCESS";
		Connection con = getConnection();

		Statement stmt = getStatement(con);
		String updateDataQuery = "UPDATE EMP SET NAME = '" + emp.getEmpName() + "',  SALARY = " + emp.getSalary()
				+ ", ADDRESS = '" + emp.getAddress() + "',  MOBILE = " + emp.getMobileNo() + "  WHERE ID = "
				+ emp.getEmpId();

		try {
			stmt.executeUpdate(updateDataQuery);
		} catch (SQLException e) {
			msg = "FAILED";
			throw new EmplyeeDAOException("Not able to Update Employee in table", e);
		}
		return msg;
	}

	public String deleteEmployee(int empId) throws EmplyeeDAOException {
		String msg = "SUCCESS";
		Connection con = getConnection();

		Statement stmt = getStatement(con);
		String deleteQuery = "DELETE EMP WHERE ID = " + empId;

		try {
			stmt.executeUpdate(deleteQuery);
		} catch (SQLException e) {
			msg = "FAILED";
			throw new EmplyeeDAOException("Not able to Delete Employee from table", e);
		}
		return msg;
	}

	public List<Employee> getEmployees() throws EmplyeeDAOException {
		String getDataQuery = "SELECT ID, NAME, SALARY, ADDRESS,  MOBILE FROM EMP";
		Connection con = getConnection();
		Statement st = getStatement(con);
		List<Employee> empList = new ArrayList<Employee>();

		try {
			ResultSet rs = st.executeQuery(getDataQuery);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("ID"));
				emp.setEmpName(rs.getString("NAME"));
				emp.setSalary(rs.getInt("SALARY"));
				emp.setAddress(rs.getString("ADDRESS"));
				emp.setMobileNo(rs.getLong("MOBILE"));

				empList.add(emp);
			}
		} catch (SQLException e) {
			throw new EmplyeeDAOException("Not able to get Employee details from table", e);
		}
		return empList;
	}

}
