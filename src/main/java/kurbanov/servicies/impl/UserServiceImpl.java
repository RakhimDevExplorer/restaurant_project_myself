package kurbanov.servicies.impl;

import kurbanov.dto.UserRequest;
import kurbanov.dto.UserResponse;
import kurbanov.models.User;
import kurbanov.repositories.UserRepository;
import kurbanov.servicies.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Principal;

/**
 * ~ @created 18/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponse save(UserRequest userRequest) {
        User user = userRequest.build();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return UserResponse.build(user);
    }

    @Override
    public UserResponse update(Principal principal, Long userId, UserRequest userRequest) {
        return null;
    }
}
