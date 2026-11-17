package spring.jpa.pkg.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_fk")
    private Passport passport;
}