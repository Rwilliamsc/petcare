package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Appointment;
import br.edu.infnet.petcare.model.repository.AppointmentRepository;

@Service
public class AppointmentService {

  @Autowired
  private AppointmentRepository appointmentRepository;

  public boolean create(Appointment appointment) {
   return appointmentRepository.create(appointment);
}

public Collection<Appointment> list() {
    return appointmentRepository.list();
}

public Appointment getById(int key) {
  return appointmentRepository.getById(key);
}

public Appointment update(int key, Appointment appointment) {
	 return appointmentRepository.update(key, appointment);
}

public  Appointment remove(int key) {
  return appointmentRepository.remove(key);
}

}
