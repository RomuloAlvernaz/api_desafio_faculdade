package com.bookstore.alvernaz_bookstore.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookstore.alvernaz_bookstore.model.Customer;
import com.bookstore.alvernaz_bookstore.model.exception.ResourceNotFoundException;
import com.bookstore.alvernaz_bookstore.repository.CustomerRepository;


@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository; 

    public Customer adicionar(Customer customer){
        return customerRepository.save(customer); 
    }

    public List<Customer> obterTodos(){
        return customerRepository.findAll(); 
    }

    public Customer obterPorId(Long id){
        Optional<Customer> optCustomer = customerRepository.findById(id); 

        if(optCustomer.isEmpty()){ 
            throw new ResourceNotFoundException("Não existe um cliente com o ID " + id); 
        }

        return optCustomer.get(); 
    }

    public Customer atualizar(Long id, Customer customer){
        customer.setId(id);
        return customerRepository.save(customer); 
    }

    public void deletar(Long id){
        customerRepository.deleteById(id);
    }
}

