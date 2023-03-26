package br.edu.infnet.petcare.model.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.petcare.model.domain.Veterinary;

@Repository
public interface VeterinaryRepository extends CrudRepository<Veterinary, Integer>{

	@Query("from Veterinary v where v.id = :key")
	Veterinary getById(Integer key);
}
