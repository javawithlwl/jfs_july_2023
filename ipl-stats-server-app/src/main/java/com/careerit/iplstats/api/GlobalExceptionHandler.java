package com.careerit.iplstats.api;

import com.careerit.iplstats.service.exception.UserAlreadyExistsException;
import com.careerit.iplstats.service.exception.UserNotFoundException;
import com.careerit.iplstats.util.AppErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

        @ExceptionHandler(value = {UserNotFoundException.class})
        public ResponseEntity<AppErrorResponse> handleAppUserNotFoundException(UserNotFoundException ex) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(AppErrorResponse.builder()
                                .httpStatus(HttpStatus.NOT_FOUND)
                                .message(ex.getMessage())
                                .build());
        }
        @ExceptionHandler(value = {UserAlreadyExistsException.class})
        public ResponseEntity<AppErrorResponse> handleAppUserNotFoundException(UserAlreadyExistsException ex) {
                return ResponseEntity.status(HttpStatus.CONFLICT)
                        .body(AppErrorResponse.builder()
                                .httpStatus(HttpStatus.CONFLICT)
                                .message(ex.getMessage())
                                .build());
        }

}
