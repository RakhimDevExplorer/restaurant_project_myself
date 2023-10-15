package kurbanov.dto.requests;

import jakarta.validation.constraints.Email;
import kurbanov.models.User;
import kurbanov.models.enums.Role;

/**
 * ~ @created 18/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
public record   UserRequest(
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
