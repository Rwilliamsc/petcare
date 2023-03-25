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
import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.service.PetService;

@Order(3)
@Component
public class PetLoader implements ApplicationRunner {
  
  @Autowired
  private PetService petService;

  @Override
  public void run(ApplicationArguments args) throws Exception {

      try {
        String arq = "pets.txt";
        
        try {
          FileReader fileR = new FileReader(arq);
          BufferedReader readFile = new BufferedReader(fileR);

          String line = readFile.readLine();
          String[] field = null;

          while(line != null) {
            
            field = line.split(";");
            
            Pet pet = new Pet(
              field[0], 
              field[1], 
              field[2],
              Integer.parseInt(field[3]),
              field[4]
            );

            User user = new User();
            user.setId(Integer.parseInt(field[5]));
            
            pet.setUser(user);
            petService.create(pet);

            System.out.println("A inclusão do pet "+pet.getName()+" foi realizada com sucesso!!!");

            line = readFile.readLine();
          }

          readFile.close();
          fileR.close();
        } catch (IOException e) {
          System.out.println("[ERRO] " + e.getMessage());
        } 
        
      } finally {
        System.out.println("Autoloader de pets realizado com sucesso!!!");
      }		
    
    
  }
  
}
