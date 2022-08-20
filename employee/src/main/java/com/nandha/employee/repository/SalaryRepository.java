package com.nandha.employee.repository;

import com.nandha.employee.model.Salary;
import com.nandha.employee.model.SalaryId;

import org.springframework.data.repository.CrudRepository;

public interface SalaryRepository extends CrudRepository<Salary, SalaryId> {
}
