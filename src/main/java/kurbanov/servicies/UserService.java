package kurbanov.servicies;

import kurbanov.dto.UserRequest;
import kurbanov.dto.UserResponse;

import java.security.Principal;

/**
 * ~ @created 18/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
public interface UserService {
    UserResponse save(UserRequest userRequest);

    UserResponse update(Principal principal, Long userId, UserRequest userRequest);
}
