package com.dev.springboot.thymeleaf.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.dev.springboot.thymeleaf.model.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployees();
	Employee saveEmployee(Employee emp);
	Employee findByEmpId(Long id);
	void deleteEmpByEmpId(Long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDir);
}
