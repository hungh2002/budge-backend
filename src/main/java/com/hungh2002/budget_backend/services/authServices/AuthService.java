package com.hungh2002.budget_backend.services.authServices;

import java.util.Map;
import com.hungh2002.budget_backend.dto.SignInDTO;
import com.hungh2002.budget_backend.dto.SignUpDTO;

public interface AuthService {
    public Map<String, Long> signIn(SignInDTO signInDTO);

    public void signUp(SignUpDTO signUpDTO);
}
