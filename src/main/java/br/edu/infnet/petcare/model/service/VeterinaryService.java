package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Veterinary;
import br.edu.infnet.petcare.model.interfaces.VeterinaryRepository;

@Service
public class VeterinaryService {

  @Autowired
  private VeterinaryRepository veterinaryRepository;

  public Veterinary create(Veterinary veterinary) {
   return veterinaryRepository.save(veterinary);
  }

  public Collection<Veterinary> list() {
      return (Collection<Veterinary>)veterinaryRepository.findAll();
  }

  public Veterinary getById(int key) {
    return veterinaryRepository.getById(key);
  }

  public Veterinary update(int key, Veterinary veterinary) {
    return veterinary;//veterinaryRepository.update(key, veterinary);
  }

  public void remove(int key) {
    veterinaryRepository.deleteById(key);
  }

}
