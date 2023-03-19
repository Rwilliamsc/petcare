package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    
    private static Map<Integer, User> database = new HashMap<Integer, User>();


    public  boolean create(User user) {
        try {
            user.setId(nextId());
            if (user.getStatus().isEmpty()) {
                user.setStatus("ACTIVE");
            }
            database.put(user.getId(), user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public  Collection<User> list() {
        return database.values();
    }
    
    public  User getById(int key) {
    	return database.get(key);
    }
    
    public  User update(int key, User user) {
    	database.replace(user.getId(), user);
        return database.get(key);
    }

    public  User remove(int key) {
    	return database.remove(key);
    }

    public int nextId() {
        return database.size() + 1;
    }
}
