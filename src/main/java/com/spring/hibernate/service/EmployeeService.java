package com.spring.hibernate.service;

import com.spring.hibernate.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void addEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
