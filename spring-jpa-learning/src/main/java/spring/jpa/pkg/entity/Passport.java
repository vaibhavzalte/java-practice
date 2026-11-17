package spring.jpa.pkg.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "passport")
@Data
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String passportNumber;

    private String country;

    @OneToOne(mappedBy = "passportDetails")
    @JsonBackReference
    private Applicant applicant;
}
