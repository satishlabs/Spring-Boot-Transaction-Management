package com.boot.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.transaction.model.Employee;
import com.boot.transaction.model.EmployeeHealthInsurance;
import com.boot.transaction.service.OrganizationService;

@SpringBootApplication
public class SpringBootJdbcTransactionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcTransactionApplication.class, args);
		OrganizationService organizationService = context.getBean(OrganizationService.class);
		
		Employee emp = new Employee();
		emp.setEmpId("111");
		emp.setEmpName("Satish");
		
		EmployeeHealthInsurance empHealth = new EmployeeHealthInsurance();
		empHealth.setEmpId("999");
		empHealth.setHealthInsuranceSchemeName("Premium");
		empHealth.setCoverageAmount(20000);
		
		organizationService.joinOrganization(emp, empHealth);
		
	}

}
