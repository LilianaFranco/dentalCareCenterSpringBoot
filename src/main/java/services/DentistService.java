package services;

import domain.Dentist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DentistRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DentistService {

    @Autowired
    DentistRepository dentistRepository;

    public List<Dentist> getAllDentists() {
        List<Dentist> dentists = new ArrayList<Dentist>();
        dentistRepository.findAll().forEach(dentist1 -> dentists.add(dentist1));
        return dentists;
    }

    public Dentist getDentistById(Integer id){
        return dentistRepository.findById(id).get();
    }

    public void saveOrUpdate(Dentist dentist)
    {
        dentistRepository.save(dentist);
    }

    public void delete(Integer id)
    {
       dentistRepository.deleteById(id);
    }

    public void update(Dentist dentist, Integer dentistId){
        dentistRepository.save(dentist);
    }


}