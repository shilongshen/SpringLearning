package com.demo.dao;

import com.demo.bean.Employee;

import java.util.List;

public interface EmployeeMapper {
    Employee getEmployeeById(Integer id);

    List<Employee> getEmps();
}
