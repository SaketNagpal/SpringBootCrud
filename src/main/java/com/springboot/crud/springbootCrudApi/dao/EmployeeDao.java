package com.springboot.crud.springbootCrudApi.dao;

import java.util.List;

import com.springboot.crud.springbootCrudApi.model.Employee;


public interface EmployeeDao {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save (Employee employee);
	
	void delete(int id);
}
