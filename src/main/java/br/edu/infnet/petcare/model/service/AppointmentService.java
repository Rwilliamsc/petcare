package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Appointment;
import br.edu.infnet.petcare.model.interfaces.AppointmentRepository;

@Service
public class AppointmentService {

  @Autowired
  private AppointmentRepository appointmentRepository;

  public Appointment create(Appointment appointment) {
   return appointmentRepository.save(appointment);
}

public Collection<Appointment> list() {
    return (Collection<Appointment>) appointmentRepository.findAll();
}

public Appointment getById(int key) {
  return appointmentRepository.getById(key);
}

public Appointment update(int key, Appointment appointment) {
	 return appointment; //appointmentRepository.update(key, appointment);
}

public void remove(int key) {
  appointmentRepository.deleteById(key);
}

}
