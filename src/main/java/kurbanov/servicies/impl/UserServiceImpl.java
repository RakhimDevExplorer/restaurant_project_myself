package kurbanov.servicies.impl;

import jakarta.transaction.Transactional;
import kurbanov.dto.requests.UserRequest;
import kurbanov.dto.responses.UserResponse;
import kurbanov.exception.EmailAlreadyExistException;
import kurbanov.exception.NotFoundException;
import kurbanov.models.User;
import kurbanov.repositories.UserRepository;
import kurbanov.servicies.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * ~ @created 18/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponse save(UserRequest userRequest) {
        User user = userRequest.build();
        if (!userRequest.email().contains("@")) {
            throw new EmailAlreadyExistException(String.format("%s You must use this symbol", "@"));
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return UserResponse.build(user);
    }

    @Override
    @Transactional
    public UserResponse update(Long userId, UserRequest userRequest) {
        final User userForResponse = update(userRequest, userId);
        return new UserResponse(userForResponse.getId(), userForResponse.getFullName(), userForResponse.getEmail(), userForResponse.getRole());
    }

//        final String email = principal.getName();
//        final User authUser = userRepository.findUserByEmail(email).orElseThrow(() -> new NotFoundException(String.format("User %s with email not found please try again ", email)));
//        if (!authUser.getId().equals(userId)) {
//            throw new BadCredentialsException("Sorry You want to change other users information");
//        }
//        final User userForResponse = update(userRequest, userId);
//
//    }

    @Override
    public UserResponse findById(Long userId) {
        final User user = userRepository.findById(userId).orElseThrow(() -> new NotFoundException(String.format("%d - this id user not found", userId)));
        return UserResponse.build(user);
    }

    private User update(UserRequest userRequest, Long userId) {
        final User currentUser = userRepository.findById(userId).orElseThrow(() -> new NotFoundException(String.format("Sorry %s with this id user not found try again", userId)));
        final User newUser = userRequest.build();
        currentUser.setFullName(newUser.getFullName());
        currentUser.setEmail(newUser.getEmail());
        return newUser;


    }

}
