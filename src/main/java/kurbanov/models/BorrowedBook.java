package kurbanov.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.FetchType.LAZY;

/**
 * ~ @created 01/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@Entity
@Table(name = "borrowed_books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BorrowedBook extends BaseEntity {
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private boolean returned;
    @ManyToOne(cascade = {PERSIST, REFRESH, DETACH}, fetch = LAZY)
    private User user;
    @ManyToOne(cascade = ALL)
    private Book book;


}
