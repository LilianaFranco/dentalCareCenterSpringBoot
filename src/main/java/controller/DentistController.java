package controller;

import domain.Dentist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.DentistService;

import java.util.List;


@RestController
public class DentistController {

    @Autowired
    private final DentistService dentistService;

    public DentistController(DentistService dentistService) {
        this.dentistService = dentistService;
    }

    @GetMapping("/dentist")
    public String WelcomeDentist(){
        return "Welcome, dear dentist";
    }

    @GetMapping("/dentist")
    private List<Dentist> getAllDentists() {
        return dentistService.getAllDentists();
    }

    @GetMapping("/dentist/{dentistId}")
    private Dentist getDentist(@PathVariable("dentistId") Integer dentistId) {
        return dentistService.getDentistById(dentistId);
    }

    @DeleteMapping("/dentist/{dentistId}")
    private void deleteDentist(@PathVariable("dentistId") Integer dentistId)
    {
        dentistService.delete(dentistId);
    }

    @PostMapping("/dentists")
    private int saveDentist(@RequestBody Dentist dentist)
    {
        dentistService.saveOrUpdate(dentist);
        return dentist.getId();
    }

    @PutMapping("/books")
    private Dentist update(@RequestBody Dentist dentist)
    {
        dentistService.saveOrUpdate(dentist);
        return dentist;
    }
}
