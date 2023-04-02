package br.edu.infnet.petcare.model.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.petcare.model.domain.Address;

@FeignClient(url="https://viacep.com.br/ws/", name = "ViaCepService")
public interface AddressRepository {

  @GetMapping("{cep}/json")
  Address getAddress(@PathVariable("cep") String cep);
}
