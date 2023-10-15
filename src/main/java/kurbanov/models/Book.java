package kurbanov.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import kurbanov.models.enums.Genre;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * ~ @created 01/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@Entity
@Table(name = "books")
@Getter
@Setter
@Builder
public class Book extends BaseEntity {
    private String isbn;
    private String title;
    private String author;
    private Genre genre;
    private LocalDate publicationDate;
    private boolean available;


    public Book() {

    }
}
