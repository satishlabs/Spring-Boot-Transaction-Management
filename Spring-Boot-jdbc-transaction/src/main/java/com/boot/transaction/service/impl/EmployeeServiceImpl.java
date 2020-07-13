package com.boot.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.transaction.dao.EmployeeDao;
import com.boot.transaction.model.Employee;
import com.boot.transaction.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public void insertEmployee(Employee emp) {
		employeeDao.insertEmployee(emp);
	}

	@Override
	public void deleteEmployeeById(String empId) {
		employeeDao.deleteEmployeeById(empId);
	}

}
