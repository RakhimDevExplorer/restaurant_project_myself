package kurbanov.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

/**
 * ~ @created 02/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExceptionResponse {
    private HttpStatus httpStatus;
    private String exceptionClassName;
    private String message;

}
