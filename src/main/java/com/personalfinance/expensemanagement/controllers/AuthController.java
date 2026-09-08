package com.personalfinance.expensemanagement.controllers;

import com.personalfinance.expensemanagement.dto.request.*;
import com.personalfinance.expensemanagement.dto.response.DataCreationResponse;
import com.personalfinance.expensemanagement.dto.response.SystemIdentityProvidingResponse;
import com.personalfinance.expensemanagement.dto.response.UserDetailsResponse;
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
    public ResponseEntity<SystemIdentityProvidingResponse> loginUser(@Valid @RequestBody LoginRequest dto) {
        return new ResponseEntity<>(authServices.loginUser(dto), HttpStatusCode.valueOf(200));
    }

    @PatchMapping("/user/edit/account/details")
    public ResponseEntity<Void> editUserDetails(@Valid @RequestBody UserDetailsEditRequest dto) {
        return new ResponseEntity<>(authServices.editUserDetails(dto), HttpStatusCode.valueOf(204));
    }

    @GetMapping("/user/get/account/details")
    public ResponseEntity<UserDetailsResponse> getUserDetails(@Valid @RequestBody GetUserDetailsRequest dto) {
        return new ResponseEntity<>(authServices.getUserDetails(dto), HttpStatusCode.valueOf(200));
    }

    @DeleteMapping("/user/delete/account")
    public ResponseEntity<Void> deleteUserAccount(@Valid @RequestBody CoreAccountDetailUpdateRequest dto) {
        return new ResponseEntity<>(authServices.deleteUserAccount(dto), HttpStatusCode.valueOf(204));
    }

    @PatchMapping("/user/edit/account/password")
    public ResponseEntity<Void> changeAccountPassword(@Valid @RequestBody CoreAccountDetailUpdateRequest dto) {
        return new ResponseEntity<>(authServices.editUserAccountPassword(dto), HttpStatusCode.valueOf(204));
    }
}
