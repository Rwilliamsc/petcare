package br.edu.infnet.petcare.model.interfaces;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.petcare.model.domain.Services;

@Repository
public interface ServiceRepository extends CrudRepository<Services, Integer>{

	@Query("from Services s where s.id = :key")
	Services getById(Integer key);

	@Query("from Services s where s.vet.id = :vetId")
	List<Services> getByVetId(Integer vetId);
	
	@Query("from Services")
	List<Services> getList(Sort sort);
}
