package com.example.employee.repository;

import java.util.*;

import com.example.employee.model.Employee;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.IntArraySerializer;

public interface EmployeeRepository {

    ArrayList<Employee> getEmployees();

    Employee getEmployeeById(int employeeId);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);
}
