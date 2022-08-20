package com.nandha.employee.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int emp_no;
    private Date birth_date;
    private String first_name;
    private String last_name;
    private String gender;
    private Date hire_date;
}
