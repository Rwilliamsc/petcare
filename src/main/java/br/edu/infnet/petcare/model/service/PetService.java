package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Pet;
import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.interfaces.PetRepository;

@Service
public class PetService {

  @Autowired
  private PetRepository petRepository;

  public Pet create(Pet pet) {
   return petRepository.save(pet);
  }

  public Collection<Pet> list() {
      return (Collection<Pet>) petRepository.getList(Sort.by(Direction.ASC, "name"));
  }
  public Collection<Pet> list(User user) {
      return (Collection<Pet>) petRepository.getByuserId(user.getId(), Sort.by(Direction.ASC, "name"));
  }

  public Pet getById(int key) {
    return petRepository.getById(key);
  }
  
  public Pet update(int key, Pet pet) {
    return petRepository.save(pet);
  }

  public void remove(int key) {
     petRepository.deleteById(key);
  }

}
