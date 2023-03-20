package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.Veterinary;
import org.springframework.stereotype.Repository;

@Repository
public class VeterinaryRepository {
    
    private static Map<Integer, Veterinary> database = new HashMap<Integer, Veterinary>();


    public boolean create(Veterinary veterinary) {
        try {
            veterinary.setId(nextId());
            if (veterinary.getStatus().isEmpty()) {
                veterinary.setStatus("ACTIVE");
            }
            database.put(veterinary.getId(), veterinary);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Collection<Veterinary> list() {
        return database.values();
    }
    
    public Veterinary getById(int key) {
    	return database.get(key);
    }
    
    public Veterinary update(int key, Veterinary veterinary) {
    	database.replace(veterinary.getId(), veterinary);
        return database.get(key);
    }

    public  Veterinary remove(int key) {
    	return database.remove(key);
    }

    public int nextId() {
        return database.size() + 1;
    }
}
