package com.trader.controller;

import com.trader.dto.EmployeeDto;
import com.trader.entity.Employee;
import com.trader.service.EmployeeService;
import com.trader.serviceImpl.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/trader/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


@PostMapping("/add")
   public void addEmployee(@RequestBody Employee employee){
        employee.setPhoto(employeeService.imageToByteArray(employee));

    employeeService.addNewEmployee(employee);



    }
}
