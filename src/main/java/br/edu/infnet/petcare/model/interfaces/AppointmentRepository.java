package br.edu.infnet.petcare.model.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.petcare.model.domain.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer>{

	@Query("from Appointment a where a.id = :key")
	Appointment getById(Integer key);

	@Query("from Appointment a where a.vet.id = :vetId")
	List<Appointment> getByVetId(Integer vetId);
}
