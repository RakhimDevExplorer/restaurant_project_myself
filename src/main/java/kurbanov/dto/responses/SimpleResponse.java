package kurbanov.dto.responses;

import org.springframework.http.HttpStatus;

/**
 * ~ @created 15/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
public record SimpleResponse(
        HttpStatus status,
        String message
) {
}
