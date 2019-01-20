package cn.wilamr.liurui.demo.repository;

import cn.wilamr.liurui.demo.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,String> {
}
