package com.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.emp.dao.EmployeeDAO;
import com.emp.exceptions.EmplyeeDAOException;
import com.emp.model.Employee;

public class SaveEmployeeController implements Servlet {

	public void destroy() {
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
	}

	EmployeeDAO employeeDAO = new EmployeeDAO();

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Employee emp = new Employee();
		emp.setEmpId(Integer.valueOf(req.getParameter("employeeId")));
		emp.setEmpName(req.getParameter("employeeName"));
		emp.setSalary(Integer.valueOf(req.getParameter("employeeSalary")));
		emp.setAddress(req.getParameter("employeeAddress"));
		emp.setMobileNo(Long.valueOf(req.getParameter("employeeMobileNo")));

		try {
			System.out.println(emp);
			employeeDAO.insertEmployee(emp);
			PrintWriter out = res.getWriter();
			res.setContentType("text/html");
			out.println("<html><body>Employe Account Created Successfully");
			out.println(displayEmployee(out));
			out.println("</body> </html>");
		} catch (EmplyeeDAOException e) {
			e.printStackTrace();
		}
	}

	public String displayEmployee(PrintWriter out) throws IOException, EmplyeeDAOException {
		List<Employee> empList = employeeDAO.getEmployees();

		String table = "<table><tr>\r\n" + "				<th>Employee Id</th>\r\n"
				+ "				<th>Name</th>\r\n" + "				<th>Salary</th>\r\n"
				+ "				<th>Address</th>\r\n" + "				<th>Mobile</th>\r\n" + "			</tr>";

		for (Employee emp : empList) {
			table = table + "<tr>" + "<td>"+emp.getEmpId()+"</td>" 
														+ "<td>"+emp.getEmpName()+"</td>" 
														+ "<td>"+emp.getSalary()+"</td>" 
														+ "<td>"+emp.getAddress()+"</td>"
														+ "<td>"+emp.getMobileNo()+"</td>" + "<tr>";
		}

		table = table + "</table>";

		return table;
	}

}
