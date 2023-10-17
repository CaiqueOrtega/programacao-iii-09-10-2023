package com.atividade.demo.service;

import com.atividade.demo.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ClienteService {
    private static final HashMap<Integer, Cliente> clientes = new HashMap<>();

    public Cliente create(Cliente cliente){
        Integer nextId = clientes.keySet().size() + 1;
        cliente.setClienteId(nextId);
        clientes.put(nextId, cliente);
        return cliente;
    }

    public List<Cliente> getAll(){
        return new ArrayList<>(clientes.values());
    }
    public Cliente getById (Integer clientId){
        return clientes.get(clientId);
    }

}
