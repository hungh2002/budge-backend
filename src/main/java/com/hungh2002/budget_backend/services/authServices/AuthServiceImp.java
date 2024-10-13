package com.hungh2002.budget_backend.services.authServices;

import java.util.HashMap;
import java.time.LocalDateTime;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hungh2002.budget_backend.dto.SignInDTO;
import com.hungh2002.budget_backend.dto.SignUpDTO;
import com.hungh2002.budget_backend.entity.User;
import com.hungh2002.budget_backend.repository.UserRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class AuthServiceImp implements AuthService {
    @Autowired
    private UserRepository userRepository;

    public Map<String, Long> signIn(SignInDTO signInDTO) {
        User user = userRepository.findByUsername(signInDTO.getUsername());
        if (user != null && user.getPassword().equals(signInDTO.getPassword())) {
            Map<String, Long> userId = new HashMap<String, Long>();
            userId.put("userId", user.getId());
            return userId;
        } else {
            throw new EntityNotFoundException(
                    "The username and/or password appears to be invalid ");
        }
    }

    public void signUp(SignUpDTO signUpDTO) {
        User user = new User();

        if (signUpDTO.getUsername() != null) {
            User userTemp = userRepository.findByUsername(signUpDTO.getUsername());

            if (userTemp != null) {
                throw new EntityExistsException(
                        "User \" " + user.getUsername() + " \" name already exists");
            } else {
                user.setUsername(signUpDTO.getUsername());
            }
        }

        else {
            user.setUsername(String.valueOf(LocalDateTime.now().getNano()));
        }

        user.setEmail(signUpDTO.getEmail());
        user.setPassword(signUpDTO.getPassword());
        userRepository.save(user);
    }
}
