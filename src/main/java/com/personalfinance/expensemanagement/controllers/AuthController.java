package com.personalfinance.expensemanagement.controllers;

import com.personalfinance.expensemanagement.dto.entitydto.UserDetails;
import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.dto.response.LoginResponse;
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
    public ResponseEntity<DataCreationResponse> registerUser(@Valid @RequestBody UserRegistrationRequest dto) {
        return new ResponseEntity<>(authServices.registerUser(dto), HttpStatusCode.valueOf(201));
    }

    @PostMapping("/user/login")
    public ResponseEntity<LoginResponse> loginUser(@Valid @RequestBody LoginRequest dto) {
        return new ResponseEntity<>(authServices.loginUser(dto), HttpStatusCode.valueOf(200));
    }

    @PatchMapping("/{username}/edit/account/details")
    public ResponseEntity<Void> editUserDetails(@Valid @RequestBody UserDetailsEditRequest dto, @PathVariable String username) {
        return new ResponseEntity<>(authServices.editUserDetails(dto, username), HttpStatusCode.valueOf(204));
    }

    @GetMapping("/{username}/get/account/details")
    public ResponseEntity<UserDetails> getUserDetails(@PathVariable String username) {
        return new ResponseEntity<>(authServices.getUserDetails(username), HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/{username}/delete/account/{password}")
    public ResponseEntity<Void> deleteUserAccount(
            @PathVariable String username,
            @PathVariable String password) {
        return new ResponseEntity<>(authServices.deleteUserAccount(username, password), HttpStatusCode.valueOf(204));
    }

    @PatchMapping("/{username}/edit/account/password")
    public ResponseEntity<Void> changeAccountPassword(
            @Valid @RequestBody UpdatePasswordRequest dto,
            @PathVariable String username) {
        return new ResponseEntity<>(authServices.editUserAccountPassword(dto, username), HttpStatusCode.valueOf(204));
    }
}
