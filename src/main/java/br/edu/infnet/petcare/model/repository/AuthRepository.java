package br.edu.infnet.petcare.model.repository;


import java.util.List;

import br.edu.infnet.petcare.model.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class AuthRepository {
    static public Boolean auth(User user) {
        List<User> userList = UserRepository.list();

        for (User item : userList) {
            if (item.getEmail().equalsIgnoreCase(user.getEmail()) &&
                    item.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
