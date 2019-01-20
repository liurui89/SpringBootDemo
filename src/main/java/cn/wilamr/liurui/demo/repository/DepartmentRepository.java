package cn.wilamr.liurui.demo.repository;

import cn.wilamr.liurui.demo.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
