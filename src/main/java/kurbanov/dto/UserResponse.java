package kurbanov.dto;

import kurbanov.models.enums.Role;
import kurbanov.models.User;

/**
 * ~ @created 18/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
public record UserResponse(
        Long id,
        String fullName,
        String email,
        Role role
) {
    public static UserResponse build(User user) {
        return new UserResponse(
                user.getId(),
                user.getFullName(),
                user.getEmail(),
                user.getRole()
        );
    }
}
