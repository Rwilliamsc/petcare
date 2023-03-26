package br.edu.infnet.petcare.model.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.petcare.model.domain.Surgery;

@Repository
public interface SurgeryRepository extends CrudRepository<Surgery, Integer>{

	@Query("from Surgery s where s.id = :key")
	Surgery getById(Integer key);

	@Query("from Surgery s where s.vet.id = :vetId")
	List<Surgery> getByVetId(Integer vetId);
}
