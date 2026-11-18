package spring.jpa.pkg.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departmentName;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Employee> employees;
}