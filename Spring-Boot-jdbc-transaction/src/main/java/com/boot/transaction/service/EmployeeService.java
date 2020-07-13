package com.boot.transaction.service;

import com.boot.transaction.model.Employee;

public interface EmployeeService {
	public void insertEmployee(Employee emp);
	public void deleteEmployeeById(String empId);
}
