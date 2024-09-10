package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Customer;
import dev.germantovar.springboot.repository.CustomerRepository;
import dev.germantovar.springboot.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Se utiliza para definir una clase como un controlador que maneja solicitudes
// HTTP y devuelve datos en formato JSON o XML

public class CustomerController {
      @Autowired // se utiliza para la inyección de dependencias de manera automática
      private ICustomerService service;

      @Autowired
      private CustomerRepository customerRepository;

      @GetMapping("lista")  // se utiliza para manejar solicitudes HTTP GET en los controladores de una aplicación
      public List<Customer> getAll(){ return service.getAll();}
}
