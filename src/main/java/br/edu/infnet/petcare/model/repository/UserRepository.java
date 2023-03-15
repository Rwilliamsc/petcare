package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    
    private static Map<Integer, User> database = new HashMap<Integer, User>();


    public static boolean create(User user) {
        try {
            user.setId(nextId());
            user.setStatus("ACTIVE");
            database.put(user.getId(), user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Collection<User> list() {
        return database.values();
    }
    
    public static User getById(int key) {
    	return database.get(key);
    }
    
    public static User update(int key, User user) {
    	User itemEdit = database.get(key);
        itemEdit = user;
        return itemEdit;
    }

    public static User remove(int key) {
    	return database.remove(key);
    }

    public static int nextId() {
        return database.size() + 1;
    }
}
