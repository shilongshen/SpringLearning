package com.demo.Controller;

import com.demo.Service.EmployreeService;
import com.demo.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

//    控制器自动注入service
    @Autowired
    EmployreeService employreeService;

    @RequestMapping("/getEmps")
    public String emps(){
        List<Employee> employees=employreeService.getEmps();
        return "list";
    }
}
