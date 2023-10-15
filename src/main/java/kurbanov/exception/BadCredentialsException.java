package kurbanov.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ~ @created 02/10/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
@ResponseStatus(HttpStatus.FORBIDDEN)
public class BadCredentialsException extends RuntimeException {
    public BadCredentialsException() {
    }

    public BadCredentialsException(String message) {
        super(message);
    }
}
