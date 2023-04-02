package br.edu.infnet.petcare.model.interfaces;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.petcare.model.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
  
	@Query("FROM User u WHERE u.email = :email and u.password = :password")
  User authenticated(String email, String password);

  @Query("from User u where u.id = :key")
	User getById(Integer key);
  
  @Query("from User")
  List<User> getList(Sort sort);
}