package spring.jpa.pkg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.jpa.pkg.entity.Applicant;
import spring.jpa.pkg.entity.Passport;
import spring.jpa.pkg.repository.ApplicantRepository;
import spring.jpa.pkg.repository.PassportRepository;

import java.util.List;

@Service
public class PassportService {

    @Autowired
    private PassportRepository passportRepository;

    @Autowired
    private ApplicantRepository applicantRepository;

    public List<Passport> getAll() {
        return passportRepository.findAll();
    }

    public Passport create(Passport passport, Long applicantId) {
        Applicant applicant = applicantRepository.findById(applicantId).orElseThrow(() -> new RuntimeException("Applicant not found"));
        applicant.setPassportDetails(passport);
        Applicant savedApplicant = applicantRepository.save(applicant);
        return savedApplicant.getPassportDetails();
    }
}
