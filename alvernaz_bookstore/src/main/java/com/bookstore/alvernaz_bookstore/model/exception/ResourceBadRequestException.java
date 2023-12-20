package com.bookstore.alvernaz_bookstore.model.exception;

public class ResourceBadRequestException extends RuntimeException {

    public ResourceBadRequestException(String mensagem){
        super(mensagem); 
    }
}
