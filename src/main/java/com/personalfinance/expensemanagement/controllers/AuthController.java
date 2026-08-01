package com.personalfinance.expensemanagement.controllers;

import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.GenericResponse;
import com.personalfinance.expensemanagement.services.AuthServices;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthServices authServices;

    AuthController(AuthServices authServices) {
        this.authServices = authServices;
    }

    @PostMapping("/user/register")
    public ResponseEntity<GenericResponse> registerUser(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(authServices.registerUser(dto), HttpStatusCode.valueOf(201));
    }

    @PostMapping("/user/login")
    public ResponseEntity<GenericResponse> loginUser(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(authServices.loginUser(dto), HttpStatusCode.valueOf(200));
    }

    @PatchMapping("/user/edit")
    public ResponseEntity<Void> editUserDetails(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(authServices.editUserDetails(dto), HttpStatusCode.valueOf(204));
    }

    @GetMapping("/user/get")
    public ResponseEntity<GenericResponse> getUserDetails(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(authServices.getUserDetails(dto), HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/user/delete")
    public ResponseEntity<Void> deleteUserAccount(@Valid @RequestBody GenericRequest dto) {
        return new ResponseEntity<>(authServices.deleteUserAccount(dto), HttpStatusCode.valueOf(204));
    }
}
