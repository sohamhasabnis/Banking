package com.lti.core.daos;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;

@Repository("empDao")
@Scope("singleton") // by default object is singleton in Spring context //this is not compulsory
public class EmpDaoImpl implements EmpDao {

	@PersistenceContext //dependency Injection for entity manager
	private EntityManager manager;
	
	@Override
	public List<Employee> getAllEmps() throws EmpException {
		Query qry = manager.createQuery("from Emp");
		List<Employee> empList= qry.getResultList();
		return empList;
	}

	@Override
	public Employee getEmpOnId(int empId) throws EmpException {
		Employee emp= manager.find(Employee.class, empId);
		return emp;
	}

/*	@Override
	public int insertNewEmployee(Employee emp) throws EmpException {
		String qry = "INSERT INTO employees (employee_id, first_name, last_name, job_id, hire_date, salary, email) VALUES(?, ?, ?, ?, ?,?,?)";
		Object [] params = {emp.getEmployeeId(),emp.getFirstName(),emp.getLastName(),emp.getJobId(),emp.getHireDate(),emp.getSalary(),emp.getEmail()};
		int returnVal=jTemp.update(qry,params);
		return returnVal;
	}*/
}

