package com.demo.Service;


import com.demo.bean.Employee;
import com.demo.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//将service加到IOC容器中
@Service
public class EmployreeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmps() {
        return employeeMapper.getEmps();
    }

}
