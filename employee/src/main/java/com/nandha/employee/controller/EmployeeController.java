package com.nandha.employee.controller;

import java.util.ArrayList;
import java.util.List;

import com.nandha.employee.model.Employee;
import com.nandha.employee.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

	@GetMapping("/index")
	public List<Employee> index() {
        List<Employee> result = new ArrayList<Employee>();
        employeeRepository.findAll().forEach(result::add);
        return result;
	}
}
