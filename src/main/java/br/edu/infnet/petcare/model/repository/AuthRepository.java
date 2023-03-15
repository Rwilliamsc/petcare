package br.edu.infnet.petcare.model.repository;


import java.util.Collection;

import br.edu.infnet.petcare.model.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class AuthRepository {
    static public User auth(User user) {
    	Collection<User> userList = UserRepository.list();

        for (User item : userList) {
        	System.out.println(item);
            if (item.getEmail().equalsIgnoreCase(user.getEmail()) &&
                    item.getPassword().equals(user.getPassword())) {
                return item;
            }
        }
        return null;
    }
}
