package com.nandha.employee.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "salaries")
@IdClass(SalaryId.class)
public class Salary{
    @Id
    private int emp_no;
    private int salary;
    @Id
    private Date from_date;
    private Date to_date;
}
