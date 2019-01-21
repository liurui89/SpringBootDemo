package cn.wilamr.liurui.demo.service;

import cn.wilamr.liurui.demo.domain.Employee;
import cn.wilamr.liurui.demo.repository.EmployeeRepository;
import cn.wilamr.liurui.demo.web.EmployeeController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    public Employee saveOrUpdate(Employee employee) {
        log.debug("EmployeeService.saveOrUpdate, employee : {}", employee);
        return employeeRepository.save(employee);
    }
    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        log.debug("EmployeeService.findAll");
        return employeeRepository.findAll();
    }
    @Transactional(readOnly = true)
    public Employee findOneByLoginid(String loginid) {
        log.debug("EmployeeService.findOneByLoginid");
        return employeeRepository.findOneByLoginid(loginid);
    }
    @Transactional(readOnly = true)
    public Optional<Employee> findOne(Long id) {
        log.debug("EmployeeService.findOne, id : {}", id);
        return employeeRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("EmployeeService.delete, id : {}", id);
        employeeRepository.deleteById(id);
    }



}
