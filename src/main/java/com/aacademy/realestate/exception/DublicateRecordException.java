package com.aacademy.realestate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DublicateRecordException extends RuntimeException {
    public DublicateRecordException(String message) {
        super(message);
    }
}
