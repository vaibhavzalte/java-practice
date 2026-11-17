package spring.jpa.pkg.entity;

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
}
