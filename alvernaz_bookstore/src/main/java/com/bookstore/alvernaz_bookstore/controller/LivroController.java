package com.bookstore.alvernaz_bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bookstore.alvernaz_bookstore.model.Livro;
import com.bookstore.alvernaz_bookstore.service.LivroService;

@RestController
@RequestMapping("/api/livros")
@CrossOrigin("*")
public class LivroController {
    
    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> obterTodos(){

        return livroService.obterTodos(); 

    }

    @GetMapping("/{id}")
    public Livro obterPorId(@PathVariable Long id){

        return livroService.obterPorId(id); 
    }

    @PostMapping
    public Livro adicionar(@RequestBody Livro livro){
        return livroService.adicionar(livro); 
    }
}
