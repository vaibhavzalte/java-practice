package spring.jpa.pkg.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import spring.jpa.pkg.entity.Department;
import spring.jpa.pkg.entity.Employee;
import spring.jpa.pkg.repository.DepartmentRepository;
import spring.jpa.pkg.repository.EmployeeRepository;

import java.util.List;

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

    //    Create Department.
    public Department createDepartment(Department department) {
        if (department.getEmployees() != null) {
            department.getEmployees().forEach(
                    employee -> employee.setDepartment(department)
            );
        }
        Department save = departmentRepository.save(department);
        return save;
//        Because of CascadeType.ALL, both employees are saved automatically.
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Department not found"));
    }

    public Iterable<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Create Employee under existing Department
    @Transactional
    public Employee createEmployee(Long departmentId, Employee employee) {
        Department department = departmentRepository.findById(departmentId).orElseThrow(() -> new RuntimeException("Department Not Found"));
        employee.setDepartment(department);
        department.getEmployees().add(employee);
        return employeeRepository.save(employee);
    }

    // Get Employees By Department ID
    public List<Employee> getEmployeesByDepartmentId(Long departmentId) {
        Department department = departmentRepository.findById(departmentId).orElseThrow(() -> new RuntimeException("Department Not Found"));
        return department.getEmployees();
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Update Employee
    @Transactional
    public Employee updateEmployee(Long employeeId, Employee request) {

        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found"));

        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        employee.setSalary(request.getSalary());

        return employee;
    }

    // Delete Employee
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
//        Only that employee is deleted. The Department remains.
    }

    // Delete Department
    public void deleteDepartment(Long departmentId) {
        departmentRepository.deleteById(departmentId);
//        cascade = CascadeType.ALL
//        Deleting a Department through JPA also deletes its associated Employees.
    }

    @Transactional
    public Employee moveEmployee(
            Long employeeId,
            Long newDepartmentId) {

        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        Department newDepartment = departmentRepository.findById(newDepartmentId)
                .orElseThrow(() -> new RuntimeException("Department not found"));

        Department oldDepartment = employee.getDepartment();

        if (oldDepartment != null) {
            oldDepartment.getEmployees().remove(employee);
//            orphanRemoval = true automatically deletes child records that are no longer associated with their parent.
        }

        employee.setDepartment(newDepartment);
        newDepartment.getEmployees().add(employee);

        return employee;
    }
}
