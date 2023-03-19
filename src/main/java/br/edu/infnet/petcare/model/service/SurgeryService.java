package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Surgery;
import br.edu.infnet.petcare.model.repository.SurgeryRepository;

@Service
public class SurgeryService {

  @Autowired
  private SurgeryRepository surgeryRepository;

  public boolean create(Surgery surgery) {
   return surgeryRepository.create(surgery);
  }

  public Collection<Surgery> list() {
      return surgeryRepository.list();
  }

  public Surgery getById(int key) {
    return surgeryRepository.getById(key);
  }

  public Surgery update(int key, Surgery surgery) {
    return surgeryRepository.update(key, surgery);
  }

  public  Surgery remove(int key) {
    return surgeryRepository.remove(key);
  }

}
