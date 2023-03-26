package br.edu.infnet.petcare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.petcare.model.domain.Appointment;
import br.edu.infnet.petcare.model.domain.Veterinary;
import br.edu.infnet.petcare.model.service.AppointmentService;

@Order(4)
@Component
public class AppointmentLoader implements ApplicationRunner {
  
  @Autowired
  private AppointmentService appointmentService;

  @Override
  public void run(ApplicationArguments args) throws Exception {

      try {
        String arq = "appointments.txt";
        
        try {
          FileReader fileR = new FileReader(arq);
          BufferedReader readFile = new BufferedReader(fileR);

          String line = readFile.readLine();
          String[] field = null;

          while(line != null) {
            
            field = line.split(";");
            
            Appointment appointment = new Appointment(
              field[0], 
              field[1], 
              field[2],
              field[4], 
              field[5]
            );
            Veterinary vet = new Veterinary();
            vet.setId(Integer.parseInt(field[3]));

            appointment.setVet(vet);
            appointmentService.create(appointment);

            System.out.println("A inclusão do consulta "+appointment.getName()+" foi realizada com sucesso!!!");

            line = readFile.readLine();
          }

          readFile.close();
          fileR.close();
        } catch (IOException e) {
          System.out.println("[ERRO] " + e.getMessage());
        } 
        
      } finally {
        System.out.println("Autoloader de consultas realizado com sucesso!!!");
      }		
    
    
  }
  
}
