package com.concessionaria.exceptions;

public class UserAlreadyExistsException extends Throwable {
    public UserAlreadyExistsException(String message){
        super(message);
    }
}
