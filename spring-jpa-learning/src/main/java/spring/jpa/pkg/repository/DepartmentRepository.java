package spring.jpa.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.jpa.pkg.entity.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
