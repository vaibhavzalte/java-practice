package spring.jpa.pkg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.jpa.pkg.service.DepartmentService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final DepartmentService departmentService;

    public EmployeeController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

}
