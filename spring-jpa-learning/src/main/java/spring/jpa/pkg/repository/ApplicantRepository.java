package spring.jpa.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.jpa.pkg.entity.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Long> {
}
