package spring.jpa.pkg.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String company;

    @ManyToMany(mappedBy = "jobs")
    private List<Candidate> candidates;
}
