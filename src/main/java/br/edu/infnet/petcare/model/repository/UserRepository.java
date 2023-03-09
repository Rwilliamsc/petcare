package br.edu.infnet.petcare.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.petcare.model.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    
    private static Map<Integer, User> databaseUsers = new HashMap<Integer, User>();


    public static boolean create(User user) {
        try {
            user.setId(nextId());
            user.setStatus("ACTIVE");
            databaseUsers.put(user.getId(), user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Collection<User> list() {
        return databaseUsers.values();
    }
    
    public static User getById(int key) {
    	return databaseUsers.get(key);
    }
    
    public static User removeUser(int key) {
    	return databaseUsers.remove(key);
    }

    public static int nextId() {
        return databaseUsers.size() + 1;
    }
}
