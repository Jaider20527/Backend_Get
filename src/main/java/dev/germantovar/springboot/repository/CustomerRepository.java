package dev.germantovar.springboot.repository;

import dev.germantovar.springboot.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //se utiliza para marcar una clase como un "Repositorio" o "DAO" (Data Access Object)
// dentro de la arquitectura de la aplicación.
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
