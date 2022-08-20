package com.nandha.employee.controller;

import java.sql.Date;
import java.util.Optional;

import com.nandha.employee.model.Salary;
import com.nandha.employee.model.SalaryId;
import com.nandha.employee.repository.SalaryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/salary")
public class SalaryController {

    @Autowired
    private SalaryRepository salaryRepository;

	@GetMapping("/view")
	public Salary view() {
        SalaryId salaryId = new SalaryId();
        salaryId.setEmp_no(10001);
        salaryId.setFrom_date(Date.valueOf("1986-06-26"));
        Optional<Salary> salaryOptional = salaryRepository.findById(salaryId);
        return salaryOptional.get();
	}
}
