package com.example.user_registration.Controller;

import com.example.user_registration.Model.User;
import com.example.user_registration.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
  @Autowired private UserService userService;

  @PostMapping("/register")
  public ResponseEntity<?> registerUser(@RequestBody User user) {
    try {
      userService.registerUser(user);
      return ResponseEntity.ok("User registered successfully");
    } catch (Exception e) {
      return ResponseEntity.status(500).body("Registration failed: " +
                                             e.getMessage());
    }
  }

  @GetMapping("/fetch")
  public ResponseEntity<?> fetchUser(@RequestParam String username) {
    User user = userService.fetchUserByUsername(username);
    if (user != null) {
      return ResponseEntity.ok("User fetched successfully");
    } else {
      return ResponseEntity.badRequest().body("User not found");
    }
  }
}