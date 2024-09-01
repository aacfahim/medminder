package com.ghit.MedicineReminder.controller.v1;

import com.ghit.MedicineReminder.dto.LoginRequest;
import com.ghit.MedicineReminder.dto.RegisterRequest;
import com.ghit.MedicineReminder.service.AuthService;
import com.ghit.MedicineReminder.utils.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = Api.SERVER_API, allowedHeaders = "*")
@RequestMapping(Api.BASE_API + Api.AUTH)
public class AuthController {

    @Autowired
    AuthService authService;

//    @PostMapping(Api.REGISTER)
//    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
//
//        return new ResponseEntity<>(authService.register(request), HttpStatus.CREATED);
//
//    }
//
//    @PostMapping(Api.LOGIN)
//    public ResponseEntity<AuthenticationResponse> login(@RequestBody LoginRequest request){
//        return new ResponseEntity<>(authService.login(request), HttpStatus.OK);
//
//    }
}
