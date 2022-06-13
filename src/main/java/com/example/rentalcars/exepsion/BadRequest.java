package com.example.rentalcars.exepsion;

public class BadRequest extends RuntimeException{
    public BadRequest(String message) {
        super(message);
    }
}
