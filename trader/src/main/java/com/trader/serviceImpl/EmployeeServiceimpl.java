package com.trader.serviceImpl;

import com.trader.dto.EmployeeDto;
import com.trader.entity.Employee;
import com.trader.repository.EmployeeRepository;
import com.trader.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
@Service
public class EmployeeServiceimpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public byte[] imageToByteArray(Employee employee) {
        FileInputStream fis = null;
        String imagePath = employee.getPhotoPath();
            File file = new File(imagePath);
            byte[] imageBytes = new byte[(int) file.length()];
            System.out.println("Image file successfully converted to byte array.");
            return imageBytes;

    }

        @Override
        public Employee addNewEmployee (Employee employee){
            System.out.println(employee.getEmployeeID() + "h");
            return employeeRepository.save(employee);
        }

}
