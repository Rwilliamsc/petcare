package br.edu.infnet.petcare.model.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.petcare.model.domain.Service;

@Repository
public interface ServiceRepository extends CrudRepository<Service, Integer>{

	@Query("from Service s where s.id = :key")
	Service getById(Integer key);

	@Query("from Service s where s.vet.id = :vetId")
	List<Service> getByVetId(Integer vetId);
}
