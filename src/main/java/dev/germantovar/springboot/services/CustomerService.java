package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Customer;
import dev.germantovar.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //se utiliza para marcar una clase como un "Servicio" dentro de la arquitectura de la aplicación
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override //se utiliza para indicar que un método en una clase está sobrescribiendo
    // o implementando un método de una superclase o una interfaz
    public List<Customer> getAll() {
        return (List<Customer>) repository.findAll();
    }
}
