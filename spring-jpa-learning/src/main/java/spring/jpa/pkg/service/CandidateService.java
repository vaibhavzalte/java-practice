package spring.jpa.pkg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import spring.jpa.pkg.entity.Candidate;
import spring.jpa.pkg.repository.CandidateRepository;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;
/*
[ ] 1. Create Applicant
Save applicant with name and email.
[ ] 2. Create Job
Save job with title and company.
[ ] 3. Apply for Job
Assign multiple jobs to one applicant.
[ ] 4. Find Applicant with Jobs
Fetch applicant details along with applied jobs.
[ ] 5. Find Job with Applicants
Fetch job details along with applicants.
[ ] 6. Apply Multiple Applicants
Assign multiple applicants to one job.
[ ] 7. Remove Job Application
Remove a particular job from an applicant.
[ ] 8. Update Relationship
Move an applicant's application by removing an old relationship and adding a new one.
[ ] 9. Delete Applicant
Understand what happens to join-table records when deleting an applicant.
[ ] 10. Delete Job
Understand what happens to join-table records when deleting a job.
*/
}
