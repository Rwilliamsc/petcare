package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public boolean create(User user) {
   return userRepository.create(user);
}

public Collection<User> list() {
    return userRepository.list();
}

public User getById(int key) {
  return userRepository.getById(key);
}

public User update(int key, User user) {
	 return userRepository.update(key, user);
}

public  User remove(int key) {
  return userRepository.remove(key);
}

public User auth(User user) {
	Collection<User> userList = userRepository.list();

    for (User item : userList) {
        if (item.getEmail().equalsIgnoreCase(user.getEmail()) &&
                item.getPassword().equals(user.getPassword())) {
            return item;
        }
    }
    return null;
}

}
