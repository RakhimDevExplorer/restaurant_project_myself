package kurbanov.api;

import jakarta.validation.Valid;
import kurbanov.dto.requests.UserRequest;
import kurbanov.dto.responses.UserResponse;
import kurbanov.models.User;
import kurbanov.servicies.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/findById/{userId}")
    public ResponseEntity<UserResponse> findById(@Valid @PathVariable Long userId) {
        return ResponseEntity.ok(userService.findById(userId));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserResponse> updateWithPrincipal(@PathVariable Long userId, @RequestBody UserRequest userRequest, Authentication authentication) {
        final User principal = (User) authentication.getPrincipal();
        return ResponseEntity.ok(userService.update(principal.getId(), userRequest));
    }

}
