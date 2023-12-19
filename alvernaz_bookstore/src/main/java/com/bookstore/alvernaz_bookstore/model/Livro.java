package com.bookstore.alvernaz_bookstore.model;

import com.bookstore.alvernaz_bookstore.model.Enum.ECategoriaLivro;

public class Livro {

    private Long id;
    private String nome;
    private Integer quantidade;
    private String autor;
    private ECategoriaLivro categoria;
    private double valor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ECategoriaLivro getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoriaLivro categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    } 

}
