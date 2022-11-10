package repository;

import domain.Dentist;
import org.springframework.data.repository.CrudRepository;

public interface DentistRepository extends CrudRepository<Dentist, Integer> {

}
