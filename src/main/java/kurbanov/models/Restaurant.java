package kurbanov.models;

import jakarta.persistence.*;
import kurbanov.models.enums.RestaurantType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

/**
 * ~ @created 20/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@Entity
@Table(name = "restaurants")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant extends BaseEntity {
    private String name;
    private String location;
    @Enumerated(EnumType.STRING)
    private RestaurantType restaurantType;
    private int numberOfEmployee;
    private int service;
    @OneToMany(cascade = ALL, mappedBy = "restaurant")
    private List<User> employees;


}
