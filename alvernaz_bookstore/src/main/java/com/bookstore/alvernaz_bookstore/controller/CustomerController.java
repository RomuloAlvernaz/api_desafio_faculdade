package com.bookstore.alvernaz_bookstore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bookstore.alvernaz_bookstore.model.Customer;
import com.bookstore.alvernaz_bookstore.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin("*")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> obterTodos(){

        return customerService.obterTodos(); 

    }

    @GetMapping("/{id}")
    public Customer obterPorId(@PathVariable Long id){

        return customerService.obterPorId(id); 
    }

    @PostMapping
    public Customer adicionar(@RequestBody Customer customer){
        return customerService.adicionar(customer); 
    }

    @PutMapping("/{id}")
    public Customer atualizar(@PathVariable Long id, @RequestBody Customer customer){
        return customerService.atualizar(id, customer); 
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        customerService.deletar(id);
    }
}
