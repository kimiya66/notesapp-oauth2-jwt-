package com.example.notesapp.controller;

import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/whoami")
    public Map<String, Object> whoami(@AuthenticationPrincipal OidcUser user) {
        return Map.of(
            "email", user.getEmail(),
            "name", user.getFullName(),
            "id", user.getSubject()
        );
    }
    
    @GetMapping("/token")
    public Map<String, Object> token(@AuthenticationPrincipal OidcUser user) {
        String idToken = user.getIdToken().getTokenValue();
        return Map.of("id_token", idToken);
    }

}
