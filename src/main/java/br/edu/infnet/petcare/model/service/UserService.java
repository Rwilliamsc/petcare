package br.edu.infnet.petcare.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;



import br.edu.infnet.petcare.model.domain.User;
import br.edu.infnet.petcare.model.interfaces.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User create(User user) {
   return userRepository.save(user);
  }

  public Collection<User> list() {
      return (Collection<User>) userRepository.getList(Sort.by(Direction.ASC, "name"));
  }

  public User getById(int key) {
    return userRepository.getById(key);
  }

  public User update(int key, User user) {
    return userRepository.save(user);
  }

  public void remove(int key) {
     userRepository.deleteById(key);
  }

  public User auth(User user) {
   return userRepository.authenticated(user.getEmail(), user.getPassword());
  }

}
