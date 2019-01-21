package cn.wilamr.liurui.demo.web;

import cn.wilamr.liurui.demo.domain.Employee;
import cn.wilamr.liurui.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/users")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/users/{loginid}")
    public Employee findOneByLoginid(@PathVariable("loginid") String loginid)
    {
        return employeeService.findOneByLoginid(loginid);
    }
}
