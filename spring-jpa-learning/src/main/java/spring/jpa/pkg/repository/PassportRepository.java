package spring.jpa.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.jpa.pkg.entity.Passport;


@Repository
public interface PassportRepository extends JpaRepository<Passport,Long> {
}
