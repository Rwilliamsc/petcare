package br.edu.infnet.petcare.model.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.petcare.model.domain.Schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Integer>{
	@Query("from Schedule s where s.id = :key")
	Schedule getById(Integer key);
}
