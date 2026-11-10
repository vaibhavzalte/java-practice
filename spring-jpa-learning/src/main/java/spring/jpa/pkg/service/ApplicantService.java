package spring.jpa.pkg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import spring.jpa.pkg.entity.Applicant;
import spring.jpa.pkg.repository.ApplicantRepository;

import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;

    public Applicant createApplicant(Applicant applicant){
        return applicantRepository.save(applicant);
    }

    public List<Applicant> getAllApplicants(){
        return applicantRepository.findAll();
    }

    public Page<Applicant> getApplicants(Pageable pageable){
        return applicantRepository.findAll(pageable);
    }
}
