package spring.jpa.pkg.service;

import org.springframework.stereotype.Service;
import spring.jpa.pkg.repository.DepartmentRepository;
import spring.jpa.pkg.repository.EmployeeRepository;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DepartmentService(
            DepartmentRepository departmentRepository,
            EmployeeRepository employeeRepository) {

        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }
}
