package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Pet;
import br.edu.infnet.petcare.model.repository.PetRepository;

@Service
public class PetService {

  @Autowired
  private PetRepository petRepository;

  public boolean create(Pet pet) {
   return petRepository.create(pet);
  }

  public Collection<Pet> list() {
      return petRepository.list();
  }

  public Pet getById(int key) {
    return petRepository.getById(key);
  }

  public Pet update(int key, Pet pet) {
    return petRepository.update(key, pet);
  }

  public  Pet remove(int key) {
    return petRepository.remove(key);
  }

}
