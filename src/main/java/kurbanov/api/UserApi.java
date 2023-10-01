package kurbanov.api;

import jakarta.validation.Valid;
import kurbanov.dto.UserRequest;
import kurbanov.dto.UserResponse;
import kurbanov.servicies.UserService;
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
@RequestMapping(value = "/api/users")
@RequiredArgsConstructor
public class UserApi {
    private final UserService userService;

    @PostMapping()
    public ResponseEntity<UserResponse> singUp(@Valid @RequestBody UserRequest userRequest) {
        return ResponseEntity.ok(userService.save(userRequest));
    }
}
