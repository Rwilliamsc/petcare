package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.Exam;
import br.edu.infnet.petcare.model.repository.ExamRepository;

@Service
public class ExamService {

  @Autowired
  private ExamRepository examRepository;

  public boolean create(Exam exam) {
   return examRepository.create(exam);
  }

  public Collection<Exam> list() {
      return examRepository.list();
  }

  public Exam getById(int key) {
    return examRepository.getById(key);
  }

  public Exam update(int key, Exam exam) {
    return examRepository.update(key, exam);
  }

  public  Exam remove(int key) {
    return examRepository.remove(key);
  }
}
