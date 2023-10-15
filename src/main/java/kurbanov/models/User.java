package kurbanov.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import kurbanov.models.enums.Role;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    private String fullName;

    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    private String password;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Role role;
    private int experience;


}