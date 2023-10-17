package com.atividade.demo.controller;

import com.atividade.demo.model.Cliente;
import com.atividade.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @ResponseBody
    public Cliente create(@RequestBody Cliente client){
        return clienteService.create(client);
    }
    @GetMapping
    @ResponseBody
    public List<Cliente> getAll(){
        return clienteService.getAll();
    }

   @GetMapping(value = "/{id}")
   @ResponseBody
   public Cliente getById(@PathVariable Integer id){
        return clienteService.getById(id);
   }
}
