package kurbanov.dto;

import kurbanov.models.enums.Role;

/**
 * ~ @created 18/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
public record UserResponseWithToken(
        Long id,
        String email,
        Role role,
        String token
) {
}
