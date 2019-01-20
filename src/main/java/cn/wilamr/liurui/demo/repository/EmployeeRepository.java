package cn.wilamr.liurui.demo.repository;

import cn.wilamr.liurui.demo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findOneByLoginid(String loginid);
}
