package com.boot.transaction.service;

import com.boot.transaction.model.Employee;
import com.boot.transaction.model.EmployeeHealthInsurance;

public interface OrganizationService {
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);
	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);
}
