package br.edu.infnet.petcare.model.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.infnet.petcare.model.domain.User;
import org.springframework.stereotype.Repository;
@Repository
public class UserRepository {
    static private List<User> userList = new ArrayList<User>();

    public static boolean create(User user) {
        try {
            userList.add(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static List<User> list() {
        return userList;
    }
}
