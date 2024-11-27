package com.trader.service;

import com.trader.entity.Employee;

public interface EmployeeService {
   Employee addNewEmployee(Employee employee);
   byte[] imageToByteArray(Employee employee);
}
