package com.smirnovkoss.spring_courses.spring_boot_rest.service;

import com.smirnovkoss.spring_courses.spring_boot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}