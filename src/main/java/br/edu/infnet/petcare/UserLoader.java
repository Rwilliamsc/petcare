package br.edu.infnet.petcare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.service.UserService;

@Order(2)
@Component
public class UserLoader implements ApplicationRunner {
  
  @Autowired
  private UserService userService;

  @Override
  public void run(ApplicationArguments args) throws Exception {

      try {
        String arq = "users.txt";
        
        try {
          FileReader fileR = new FileReader(arq);
          BufferedReader readFile = new BufferedReader(fileR);

          String line = readFile.readLine();
          String[] field = null;

          while(line != null) {
            
            field = line.split(";");
            
            User user = new User(
              field[0], 
              field[1], 
              field[2],
              field[3],
              field[4], 
              field[5], 
              field[6],
              field[7]
            );
            
            userService.create(user);

            System.out.println("A inclusão do usuário "+user.getName()+" foi realizada com sucesso!!!");

            line = readFile.readLine();
          }

          readFile.close();
          fileR.close();
        } catch (IOException e) {
          System.out.println("[ERRO] " + e.getMessage());
        } 
        
      } finally {
        System.out.println("Autoloader de usuários realizado com sucesso!!!");
      }		
    
    
  }
  
}
