package com.employementproject.dao;

import java.util.List;

import com.employementproject.model.Employee;

public interface  EmployeeDAO {
public boolean addEmployee(Employee e);
public List<Employee> getAllEmployees();
public boolean updateEmployee(int id, double salary);
public boolean deleteEmployee(int id);

    
}
