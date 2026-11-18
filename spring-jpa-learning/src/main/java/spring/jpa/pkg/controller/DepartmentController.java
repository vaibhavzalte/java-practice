// One Department have Many Employees
package spring.jpa.pkg.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spring.jpa.pkg.entity.Department;
import spring.jpa.pkg.entity.Employee;
import spring.jpa.pkg.service.DepartmentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/departments")
public class DepartmentController {

    final DepartmentService departmentService;

    @PostMapping("/create")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/get/{id}")
    public Department getDepartment(@PathVariable Long id) {
        return departmentService.getDepartmentById(id);
    }

    @GetMapping("/getAll")
    public Iterable<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/{departmentId}/employees")
    public Employee createEmployee(
            @PathVariable Long departmentId,
            @RequestBody Employee employee) {

        return departmentService.createEmployee(departmentId, employee);
    }
    @GetMapping("/{departmentId}/employees")
    public List<Employee> getEmployeesByDepartment(
            @PathVariable Long departmentId) {

        return departmentService.getEmployeesByDepartmentId(departmentId);
    }
    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
        return "Department deleted successfully";
    }
    @PutMapping("/{employeeId}/department/{departmentId}")
    public Employee moveEmployee(
            @PathVariable Long employeeId,
            @PathVariable Long departmentId) {

        return departmentService.moveEmployee(employeeId, departmentId);
    }
}
