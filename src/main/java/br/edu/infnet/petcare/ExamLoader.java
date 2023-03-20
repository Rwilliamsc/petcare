package br.edu.infnet.petcare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.petcare.model.domain.Exam;
import br.edu.infnet.petcare.model.service.ExamService;

@Order(5)
@Component
public class ExamLoader implements ApplicationRunner {
  
  @Autowired
  private ExamService examService;

  @Override
  public void run(ApplicationArguments args) throws Exception {

      try {
        String arq = "exams.txt";
        
        try {
          FileReader fileR = new FileReader(arq);
          BufferedReader readFile = new BufferedReader(fileR);

          String line = readFile.readLine();
          String[] field = null;

          while(line != null) {
            
            field = line.split(";");
            
            Exam exam = new Exam(
              field[0], 
              field[1], 
              field[2],
              Integer.parseInt(field[3]),
              field[4]
            );
            
            examService.create(exam);

            System.out.println("A inclusão do exame "+exam.getName()+" foi realizada com sucesso!!!");

            line = readFile.readLine();
          }

          readFile.close();
          fileR.close();
        } catch (IOException e) {
          System.out.println("[ERRO] " + e.getMessage());
        } 
        
      } finally {
        System.out.println("Autoloader de exames realizado com sucesso!!!");
      }		
    
    
  }
  
}
