package kurbanov.models;

import jakarta.persistence.*;
import kurbanov.models.enums.Role;
import kurbanov.models.enums.Status;
import lombok.*;

import java.time.LocalDate;

import static jakarta.persistence.CascadeType.ALL;

@Getter
@Setter
@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    private String password;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Role role;
    private int experience;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne(cascade =ALL)
    private Restaurant restaurant;


}