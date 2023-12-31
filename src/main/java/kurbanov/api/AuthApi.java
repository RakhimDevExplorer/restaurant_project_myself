package kurbanov.api;

import jakarta.validation.Valid;
import kurbanov.config.AuthService;
import kurbanov.dto.requests.AuthRequest;
import kurbanov.dto.responses.UserResponseWithToken;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ~ @created 18/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@RestController
@RequestMapping(value = "/api/auth")
@RequiredArgsConstructor
public class AuthApi {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<UserResponseWithToken> login(@RequestBody @Valid AuthRequest authRequest) {
        return ResponseEntity.ok(authService.login(authRequest));

    }
}
