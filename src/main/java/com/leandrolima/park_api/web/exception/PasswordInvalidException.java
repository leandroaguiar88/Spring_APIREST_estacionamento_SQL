package com.leandrolima.park_api.web.exception;

public class PasswordInvalidException extends RuntimeException{

    public PasswordInvalidException(String message) {
        super(message);
    }
}
