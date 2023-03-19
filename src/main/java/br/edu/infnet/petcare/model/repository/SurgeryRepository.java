package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.Surgery;
import org.springframework.stereotype.Repository;

@Repository
public class SurgeryRepository {
    
    private static Map<Integer, Surgery> database = new HashMap<Integer, Surgery>();


    public boolean create(Surgery surgery) {
        try {
            surgery.setId(nextId());
            database.put(surgery.getId(), surgery);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Collection<Surgery> list() {
        return database.values();
    }
    
    public Surgery getById(int key) {
        return database.get(key);
    }

    public Surgery update(int key, Surgery surgery) {
        Surgery itemEdit = database.get(key);
        itemEdit = surgery;
        return itemEdit;
    }
    public Surgery remove(int key) {
        return database.remove(key);
    }

    public int nextId() {
        return database.size() + 1;
    }
}
