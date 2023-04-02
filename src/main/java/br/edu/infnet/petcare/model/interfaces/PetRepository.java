package br.edu.infnet.petcare.model.interfaces;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.petcare.model.domain.Pet;

@Repository
public interface PetRepository extends CrudRepository<Pet, Integer>{
	
	
	@Query("from Pet p where p.id = :key")
	Pet getById(Integer key);
	
	@Query("from Pet p where p.user.id = :userId")
	List<Pet> getByuserId(Integer userId, Sort sort);

	@Query("from Pet")
	List<Pet> getList(Sort sort);

}
