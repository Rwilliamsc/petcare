package br.edu.infnet.petcare.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Address;
import br.edu.infnet.petcare.model.interfaces.AddressRepository;

@Service
public class AddressService {
  
  @Autowired
  AddressRepository addressRepository;
  
  
  public Address getAddress(String cep) {
    return addressRepository.getAddress(cep);
  }

}
