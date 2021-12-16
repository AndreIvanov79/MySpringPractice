package com.spring.rest.api.dao;

import com.spring.rest.api.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void addEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
