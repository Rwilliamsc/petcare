package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.Pet;
import org.springframework.stereotype.Repository;

@Repository
public class PetRepository {
    
    private static Map<Integer, Pet> database = new HashMap<Integer, Pet>();


    public boolean create(Pet pet) {
        try {
            pet.setId(nextId());
            database.put(pet.getId(), pet);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Collection<Pet> list() {
        return database.values();
    }
    
    public Pet getById(int key) {
    	return database.get(key);
    }

    public Pet update(int key, Pet pet) {
        Pet itemEdit = database.get(key);
        itemEdit = pet;
        return itemEdit;
    }
    
    public Pet remove(int key) {
    	return database.remove(key);
    }

    public int nextId() {
        return database.size() + 1;
    }
}
