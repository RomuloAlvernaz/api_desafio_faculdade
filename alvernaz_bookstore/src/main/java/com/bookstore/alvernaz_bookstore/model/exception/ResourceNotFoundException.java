package com.bookstore.alvernaz_bookstore.model.exception;

public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException(String mensagem){
        super(mensagem); 
    }
}
