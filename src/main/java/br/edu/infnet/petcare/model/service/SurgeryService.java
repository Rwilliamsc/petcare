package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Surgery;
import br.edu.infnet.petcare.model.interfaces.SurgeryRepository;

@Service
public class SurgeryService {

  @Autowired
  private SurgeryRepository surgeryRepository;

  public Surgery create(Surgery surgery) {
   return surgeryRepository.save(surgery);
  }

  public Collection<Surgery> list() {
      return (Collection<Surgery>) surgeryRepository.getList(Sort.by(Direction.ASC, "name"));
  }

  public Surgery getById(int key) {
    return surgeryRepository.getById(key);
  }

  public Surgery update(int key, Surgery surgery) {
    return surgeryRepository.save(surgery);
  }

  public void remove(int key) {
    surgeryRepository.deleteById(key);
  }

}
