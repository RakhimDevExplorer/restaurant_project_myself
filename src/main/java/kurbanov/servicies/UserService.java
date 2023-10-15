package kurbanov.servicies;

import kurbanov.dto.requests.UserRequest;
import kurbanov.dto.responses.UserResponse;

/**
 * ~ @created 18/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
public interface UserService {
    UserResponse save(UserRequest userRequest);

    UserResponse update(Long userId, UserRequest userRequest);

    UserResponse findById(Long userId);
}
