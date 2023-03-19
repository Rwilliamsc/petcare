package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Schedule;
import br.edu.infnet.petcare.model.repository.ScheduleRepository;

@Service
public class ScheduleService {

  @Autowired
  private ScheduleRepository scheduleRepository;

  public boolean create(Schedule schedule) {
   return scheduleRepository.create(schedule);
  }

  public Collection<Schedule> list() {
      return scheduleRepository.list();
  }

  public Schedule getById(int key) {
    return scheduleRepository.getById(key);
  }

  public Schedule update(int key, Schedule schedule) {
    return scheduleRepository.update(key, schedule);
  }

  public  Schedule remove(int key) {
    return scheduleRepository.remove(key);
  }


}
