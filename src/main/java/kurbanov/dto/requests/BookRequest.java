package kurbanov.dto.requests;

import kurbanov.models.Book;
import kurbanov.models.enums.Genre;
import lombok.Builder;

/**
 * ~ @created 15/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@Builder
public record BookRequest(
        String isbn,
        String title,
        Genre genre,
        String author
) {
    public Book build() {
        return Book.builder()
                .isbn(this.isbn)
                .title(this.title)
                .genre(this.genre)
                .author(this.author)
                .build();
    }
}
