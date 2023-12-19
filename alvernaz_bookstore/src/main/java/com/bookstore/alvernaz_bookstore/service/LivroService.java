package com.bookstore.alvernaz_bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.alvernaz_bookstore.model.Livro; // Importe a classe Livro corretamente
import com.bookstore.alvernaz_bookstore.repository.LivroRepository;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository; 

    public Livro adicionar(Livro livro){

        return livroRepository.save(livro); 
    
    }
}

