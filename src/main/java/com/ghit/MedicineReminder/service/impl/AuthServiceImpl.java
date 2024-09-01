package com.ghit.MedicineReminder.service.impl;

import com.ghit.MedicineReminder.database.repository.AuthRepository;
import com.ghit.MedicineReminder.dto.LoginRequest;
import com.ghit.MedicineReminder.dto.RegisterRequest;

import com.ghit.MedicineReminder.service.AuthService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {




}
