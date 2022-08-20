package com.nandha.employee.model;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class SalaryId implements Serializable{
    private int emp_no;
    private Date from_date;
}
