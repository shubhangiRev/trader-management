package com.trader.service;

import com.trader.dto.EmployeeDto;
import com.trader.entity.Employee;

public interface EmployeeService {
   Employee addNewEmployee(Employee employee);
   public byte[] imageToByteArray(Employee employee);
}
