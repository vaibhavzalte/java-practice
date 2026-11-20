package spring.jpa.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.jpa.pkg.entity.Candidate;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long> {

}
