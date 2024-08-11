package com.ghit.MedicineReminder.service;

import com.ghit.MedicineReminder.dto.LoginRequest;
import com.ghit.MedicineReminder.dto.RegisterRequest;
import com.ghit.MedicineReminder.security.auth.AuthenticationResponse;

public interface AuthService {

    public AuthenticationResponse login(LoginRequest request);

    public AuthenticationResponse register(RegisterRequest request);

}
