package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Services;
import br.edu.infnet.petcare.model.interfaces.ServiceRepository;

@Service
public class ServicesService {

  @Autowired
  private ServiceRepository servicesRepository;

  public Services create(Services service) {
   return servicesRepository.save(service);
  }

  public Collection<Services> list() {
      return (Collection<Services>) servicesRepository.getList(Sort.by(Direction.ASC, "name"));
  }

  public Services getById(int key) {
    return servicesRepository.getById(key);
  }

  public Services update(int key, Services service) {
    return servicesRepository.save(service);
  }

  public void remove(int key) {
    servicesRepository.deleteById(key);
  }
}
