package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Schedule;
import br.edu.infnet.petcare.model.interfaces.ScheduleRepository;

@Service
public class ScheduleService {

  @Autowired
  private ScheduleRepository scheduleRepository;

  public Schedule create(Schedule schedule) {
   return scheduleRepository.save(schedule);
  }

  public Collection<Schedule> list() {
      return (Collection<Schedule>)scheduleRepository.getList(Sort.by(Direction.ASC, "date"));
  }
  
  public Collection<Schedule> getByUser(int key) {
      return (Collection<Schedule>)scheduleRepository.getByUser(key, Sort.by(Direction.ASC, "date"));
  }

  public Schedule getById(int key) {
    return scheduleRepository.getById(key);
  }

  public Schedule update(int key, Schedule schedule) {
    return scheduleRepository.save(schedule);
  }

  public void remove(int key) {
    scheduleRepository.deleteById(key);
  }


}
