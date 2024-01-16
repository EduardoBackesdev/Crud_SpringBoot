package com.example.DesafioCrudInserir.Controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.DesafioCrudInserir.Models.Cliente;
import com.example.DesafioCrudInserir.Models.Repositories.ClienteRepository;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteRepository ClienteRepository;


    // inserir
    @PostMapping("/cadastro")
    public Cliente inserirCliente(Cliente cliente){
        ClienteRepository.save(cliente);
        return (cliente);
    }

    // listar todos
    @GetMapping
    public Iterable<Cliente> obterClientes(){
        return ClienteRepository.findAll();
    }

    // listar por id
    @GetMapping(path = "/{id}")
    public Optional<Cliente> obterClientesId(@PathVariable int id){
        return ClienteRepository.findById(id);
    }

    // alterar
    @PutMapping
    public Cliente alterarCliente(Cliente cliente){
        return ClienteRepository.save(cliente);
    }

    // deletar
    @DeleteMapping("/{id}")
    public void deleterCliente(@PathVariable int id){
        ClienteRepository.deleteById(id);
    }


    
    
    
}
