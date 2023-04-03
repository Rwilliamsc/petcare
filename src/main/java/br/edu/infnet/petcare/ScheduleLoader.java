package br.edu.infnet.petcare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.petcare.model.domain.Pet;
import br.edu.infnet.petcare.model.domain.Schedule;
import br.edu.infnet.petcare.model.domain.Exam;
import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.domain.Veterinary;
import br.edu.infnet.petcare.model.service.ScheduleService;

@Order(7)
@Component
public class ScheduleLoader implements ApplicationRunner {

  @Autowired
  private ScheduleService scheduleService;

  @Override
  public void run(ApplicationArguments args) throws Exception {

    try {
      String arq = "schedules.txt";

      try {
        FileReader fileR = new FileReader(arq);
        BufferedReader readFile = new BufferedReader(fileR);

        String line = readFile.readLine();
        String[] field = null;

        while (line != null) {

          field = line.split(";");

          Schedule schedule = new Schedule();
          schedule.setDate(field[0]);
          schedule.setEmergency(Boolean.parseBoolean(field[1]));

          Pet pet = new Pet();
          pet.setId(Integer.parseInt(field[2]));
          Exam exam = new Exam();
          exam.setId(Integer.parseInt(field[3]));
          User user = new User();
          user.setId(Integer.parseInt(field[4]));
          Veterinary vet = new Veterinary();
          vet.setId(Integer.parseInt(field[5]));

          schedule.setPet(pet);
          schedule.setService(exam);
          schedule.setUser(user);
          schedule.setVet(vet);
          scheduleService.create(schedule);

          System.out.println("A inclusão de agendamento foi realizada com sucesso!!!");

          line = readFile.readLine();
        }

        readFile.close();
        fileR.close();
      } catch (IOException e) {
        System.out.println("[ERRO] " + e.getMessage());
      }

    } finally {
      System.out.println("Autoloader de cirurgias realizado com sucesso!!!");
    }

  }

}
