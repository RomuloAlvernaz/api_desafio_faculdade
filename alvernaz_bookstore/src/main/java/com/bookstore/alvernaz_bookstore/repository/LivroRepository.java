package com.bookstore.alvernaz_bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.alvernaz_bookstore.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
 