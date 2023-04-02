package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
      return (Collection<Veterinary>)veterinaryRepository.getList(Sort.by(Direction.ASC, "name"));
  }

  public Veterinary getById(int key) {
    return veterinaryRepository.getById(key);
  }

  public Veterinary update(int key, Veterinary veterinary) {
    return veterinaryRepository.save(veterinary);
  }

  public void remove(int key) {
    veterinaryRepository.deleteById(key);
  }

}
