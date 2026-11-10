package spring.jpa.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import spring.jpa.pkg.entity.Applicant;
import spring.jpa.pkg.service.ApplicantService;

import java.util.List;

@RestController
@RequestMapping("/api/applicant")
public class ApplicantController {
    @Autowired
    private ApplicantService applicantService;

    @GetMapping("/all")
    public List<Applicant> getAll(){
        return applicantService.getAllApplicants();
    }

    @PostMapping("/create")
    public Applicant create(@RequestBody Applicant applicant){
        return applicantService.createApplicant(applicant);
    }

    @GetMapping("/all/page")
    public Page<Applicant> getAllByPaging(Pageable pageable){
        return applicantService.getApplicants(pageable);
    }
}
