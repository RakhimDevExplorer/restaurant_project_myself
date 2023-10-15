package kurbanov.dto.responses;

import lombok.Builder;

import java.time.LocalDate;

/**
 * ~ @created 15/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@Builder
public record BookResponse(
        Long id,
        String isbn,
        String title,
        String author,
        LocalDate publicationDate,
        boolean available

) {
}
