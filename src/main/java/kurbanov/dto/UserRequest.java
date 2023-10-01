package kurbanov.dto;

import kurbanov.models.enums.Role;
import kurbanov.models.User;

/**
 * ~ @created 18/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
public record UserRequest(
        String fullName,
        String email,
        String password,
        Role role
) {

    public User build() {
        return User.builder()
                .fullName(this.fullName)
                .email(this.email)
                .password(this.password)
                .role(this.role)
                .build();
    }
}
