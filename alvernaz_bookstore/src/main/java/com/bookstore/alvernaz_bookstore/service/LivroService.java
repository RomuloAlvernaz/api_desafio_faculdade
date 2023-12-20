package com.bookstore.alvernaz_bookstore.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.alvernaz_bookstore.model.Livro; 
import com.bookstore.alvernaz_bookstore.repository.LivroRepository;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository; 

    public Livro adicionar(Livro livro){
        return livroRepository.save(livro); 
    }

    public List<Livro> obterTodos(){
        return livroRepository.findAll(); 
    }

    public Livro obterPorId(Long id){
        Optional<Livro> optLivro = livroRepository.findById(id); 

        if(optLivro.isEmpty()){ 
            throw new IllegalArgumentException("Não existe um livro com o ID " + id); 
        }

        return optLivro.get(); 
    }

    public Livro atualizar(Long id, Livro livro){

        livro.setId(id);
        return livroRepository.save(livro); 

    }

    public void deletar(Long id){
        livroRepository.deleteById(id);
    }
}


