package br.edu.infnet.petcare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.petcare.model.domain.Surgery;
import br.edu.infnet.petcare.model.service.SurgeryService;

@Order(6)
@Component
public class SurgeryLoader implements ApplicationRunner {
  
  @Autowired
  private SurgeryService surgeryService;

  @Override
  public void run(ApplicationArguments args) throws Exception {

      try {
        String arq = "surgeries.txt";
        
        try {
          FileReader fileR = new FileReader(arq);
          BufferedReader readFile = new BufferedReader(fileR);

          String line = readFile.readLine();
          String[] field = null;

          while(line != null) {
            
            field = line.split(";");
            
            Surgery surgery = new Surgery(
              field[0], 
              field[1], 
              field[2],
              Integer.parseInt(field[3]),
              field[4],
              Boolean.parseBoolean(field[5]),
              Boolean.parseBoolean(field[6])
            );
            
            surgeryService.create(surgery);

            System.out.println("A inclusão da cirurgia "+surgery.getName()+" foi realizada com sucesso!!!");

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
