package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.Exam;
import org.springframework.stereotype.Repository;

@Repository
public class ExamRepository {
    
    private static Map<Integer, Exam> database = new HashMap<Integer, Exam>();


    public boolean create(Exam exam) {
        try {
            exam.setId(nextId());
            database.put(exam.getId(), exam);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Collection<Exam> list() {
        return database.values();
    }
    
    public Exam getById(int key) {
        return database.get(key);
    }

    public Exam update(int key, Exam exam) {
        database.replace(exam.getId(), exam);
        return database.get(key);
    }
    
    public Exam remove(int key) {
    	return database.remove(key);
    }

    public int nextId() {
        return database.size() + 1;
    }
}
