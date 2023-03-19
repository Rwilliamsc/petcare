package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Veterinary;
import br.edu.infnet.petcare.model.repository.VeterinaryRepository;

@Service
public class VeterinaryService {

  @Autowired
  private VeterinaryRepository veterinaryRepository;

  public boolean create(Veterinary veterinary) {
   return veterinaryRepository.create(veterinary);
  }

  public Collection<Veterinary> list() {
      return veterinaryRepository.list();
  }

  public Veterinary getById(int key) {
    return veterinaryRepository.getById(key);
  }

  public Veterinary update(int key, Veterinary veterinary) {
    return veterinaryRepository.update(key, veterinary);
  }

  public  Veterinary remove(int key) {
    return veterinaryRepository.remove(key);
  }

}
