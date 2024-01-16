package com.example.DesafioCrudInserir.Models.Repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.DesafioCrudInserir.Models.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente, Integer>{}
