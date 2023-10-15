package kurbanov.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ~ @created 02/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    public NotFoundException() {
    }
    public NotFoundException(String message) {
        super(message);
    }
}
