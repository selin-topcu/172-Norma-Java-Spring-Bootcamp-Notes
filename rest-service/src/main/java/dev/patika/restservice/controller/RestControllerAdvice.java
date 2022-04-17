package dev.patika.restservice.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {


    @ExceptionHandler(NullPointerException.class)
    public String onNullPointerExpeptionHandled(NullPointerException nullPointerException){
        return nullPointerException.getMessage();
    }
}
