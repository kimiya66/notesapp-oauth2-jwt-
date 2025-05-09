package com.example.notesapp.controller;

import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class AdminController {

    @GetMapping("/admin")
    public String admin(@AuthenticationPrincipal OidcUser user) {
        String email = user.getEmail();
        // --- just test it with a sample email ---
        if (!email.equalsIgnoreCase("kimia.beheshty@gmail.com")) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "You are not allowed to access this resource.");
        }
        return "Welcome Admin: " + email;
    }
}
