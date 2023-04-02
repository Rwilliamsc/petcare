package br.edu.infnet.petcare.model.interfaces;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.petcare.model.domain.Exam;

@Repository
public interface ExamRepository extends CrudRepository<Exam, Integer>{

	@Query("from Exam e where e.id = :key")
	Exam getById(Integer key);

	@Query("from Exam e where e.vet.id = :vetId")
	List<Exam> getByVetId(Integer vetId);
	
	@Query("from Exam")
	List<Exam> getList(Sort sort);
}
