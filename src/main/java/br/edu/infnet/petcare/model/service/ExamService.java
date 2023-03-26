package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Exam;
import br.edu.infnet.petcare.model.interfaces.ExamRepository;

@Service
public class ExamService {

  @Autowired
  private ExamRepository examRepository;

  public Exam create(Exam exam) {
   return examRepository.save(exam);
  }

  public Collection<Exam> list() {
      return (Collection<Exam>) examRepository.findAll();
  }

  public Exam getById(int key) {
    return examRepository.getById(key);
  }

  public Exam update(int key, Exam exam) {
    return exam; //examRepository.update(key, exam);
  }

  public void remove(int key) {
    examRepository.deleteById(key);
  }
}
