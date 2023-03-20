package br.edu.infnet.petcare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.petcare.model.domain.Veterinary;
import br.edu.infnet.petcare.model.service.VeterinaryService;

@Order(2)
@Component
public class VeterinaryLoader implements ApplicationRunner {
  
  @Autowired
  private VeterinaryService veterinaryService;

  @Override
  public void run(ApplicationArguments args) throws Exception {

      try {
        String arq = "veterinaries.txt";
        
        try {
          FileReader fileR = new FileReader(arq);
          BufferedReader readFile = new BufferedReader(fileR);

          String line = readFile.readLine();
          String[] field = null;

          while(line != null) {
            
            field = line.split(";");
            
            Veterinary veterinary = new Veterinary(
              field[0], 
              field[1], 
              field[2],
              field[3],
              field[4], 
              field[5], 
              field[6],
              field[7]
            );
            
            veterinaryService.create(veterinary);

            System.out.println("A inclusão do veterinário "+veterinary.getName()+" foi realizada com sucesso!!!");

            line = readFile.readLine();
          }

          readFile.close();
          fileR.close();
        } catch (IOException e) {
          System.out.println("[ERRO] " + e.getMessage());
        } 
        
      } finally {
        System.out.println("Autoloader de veterinários realizado com sucesso!!!");
      }		
    
    
  }
  
}
