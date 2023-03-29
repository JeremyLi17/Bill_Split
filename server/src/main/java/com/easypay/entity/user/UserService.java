package com.easypay.entity.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author jeremy on 2023/1/25
 */
@Service
public class UserService {
    private final UserRepo userRepo;
    private BCryptPasswordEncoder encoder;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
        this.encoder = new BCryptPasswordEncoder();
    }

    public User register(String username, String password, String email) {
        User user = new User();
        Optional<User> existUsername = userRepo.findUserByUsername(username);
        Optional<User> existEmail = userRepo.findUserByUsername(email);
        user.setUsername(username);
        user.setEmail(email);

        String encodedPassword = encoder.encode(password);
        user.setPassword(encodedPassword);
        userRepo.save(user);
        return user;
    }

    public User findUserByUsername(String username) {
        Optional<User> userOpt = userRepo.findUserByUsername(username);
        if (userOpt.isEmpty()) {
            // throw new Exception
        }
        return userOpt.get();
    }
}
