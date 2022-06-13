package com.example.rentalcars.exepsion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyException {
    @ExceptionHandler

    public ResponseEntity<?> ex(BadException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
    }
}
