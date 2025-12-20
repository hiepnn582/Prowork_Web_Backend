package com.hiepnn.prowork.controllers;

import com.hiepnn.prowork.dtos.RegistrationRequest;
import com.hiepnn.prowork.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@Validated @RequestBody RegistrationRequest request) {
        try {
            authService.register(request);
            return new ResponseEntity<>("Registration successful", HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>("Registration error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
