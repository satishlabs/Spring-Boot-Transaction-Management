package com.boot.transaction.dao;

import com.boot.transaction.model.Employee;

public interface EmployeeDao {
	public void insertEmployee(Employee emp);
	public void deleteEmployeeById(String empId);
}
