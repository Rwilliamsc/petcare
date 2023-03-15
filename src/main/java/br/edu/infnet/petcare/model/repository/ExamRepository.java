package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.Exam;
import org.springframework.stereotype.Repository;

@Repository
public class ExamRepository {
    
    private static Map<Integer, Exam> database = new HashMap<Integer, Exam>();


    public static boolean create(Exam exam) {
        try {
            exam.setId(nextId());
            database.put(exam.getId(), exam);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Collection<Exam> list() {
        return database.values();
    }
    
    public static Exam getById(int key) {
        return database.get(key);
    }

    public static Exam update(int key, Exam exam) {
        Exam itemEdit = database.get(key);
        itemEdit = exam;
        return itemEdit;
    }
    
    public static Exam remove(int key) {
    	return database.remove(key);
    }

    public static int nextId() {
        return database.size() + 1;
    }
}
