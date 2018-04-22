package com.example.cardealer.entity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BikeNotFoundException extends RuntimeException {

    public BikeNotFoundException(String exception) {
        super(exception);
    }

}
