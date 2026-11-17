package spring.jpa.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.jpa.pkg.entity.Passport;
import spring.jpa.pkg.service.PassportService;

import java.util.List;

@RestController
@RequestMapping("/api/passport")
public class PassportController {
    @Autowired
    private PassportService passportService;

    @GetMapping("/all")
    public List<Passport> getAll(){
        return passportService.getAll();
    }

    @PostMapping("/{applicantId}/create")
    public Passport create(@PathVariable Long applicantId, @RequestBody Passport passport) {
        return passportService.create(passport,applicantId);
    }
}
