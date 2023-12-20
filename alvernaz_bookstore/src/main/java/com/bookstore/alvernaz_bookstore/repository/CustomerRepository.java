package com.bookstore.alvernaz_bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.alvernaz_bookstore.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}