package cn.wilamr.liurui.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String lastname;
    String loginid;
    String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "dep_id")
    Department dept;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Employee_Job",
            inverseJoinColumns = @JoinColumn(name = "job_name"))
    Set<Job> jobs;
}
