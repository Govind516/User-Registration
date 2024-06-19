package com.example.user_registration.Service;

import com.example.user_registration.Model.User;
import com.example.user_registration.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired private UserRepository userRepository;

  public User registerUser(User user) { return userRepository.save(user); }

  public User fetchUserByUsername(String username) {
    return userRepository.findByUsername(username);
  }
}
