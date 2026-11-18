package spring.jpa.pkg.controller;

import org.springframework.web.bind.annotation.*;
import spring.jpa.pkg.entity.Employee;
import spring.jpa.pkg.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final DepartmentService departmentService;

    public EmployeeController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    @GetMapping
    public List<Employee> getAllEmployees() {
        return departmentService.getAllEmployees();
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Long id,
            @RequestBody Employee employee) {

        return departmentService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        departmentService.deleteEmployee(id);
        return "Employee deleted successfully";
    }
}
