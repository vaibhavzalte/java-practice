package spring.jpa.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.jpa.pkg.entity.Applicant;

import java.util.List;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Long> {
    List<Applicant> findByStatus(String status);
    List<Applicant> findByStatusOrderByNameAsc(String status);
    List<Applicant> findByStatusOrderByNameDesc(String status);

    @Query("SELECT a FROM Applicant a WHERE a.name LIKE %:name%")
    List<Applicant> findByPartialName(@Param("name") String partialName);
}
