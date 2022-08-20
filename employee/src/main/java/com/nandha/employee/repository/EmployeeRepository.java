package com.nandha.employee.repository;

import com.nandha.employee.model.Employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
