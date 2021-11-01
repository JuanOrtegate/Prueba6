package com.example.reto.demojuanc.repository;

import java.util.List;
import java.util.Optional;
import com.example.reto.demojuanc.model.Client;
import com.example.reto.demojuanc.repository.crud.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class ClientRepository {
    
    @Autowired
    ClientCrudRepository clientCrudRepository;
    
    public List<Client>getAll(){
        return (List<Client>)clientCrudRepository.findAll();
        
    }

    public Optional<Client>getClient(int id){
        return clientCrudRepository.findById(id);
    }
    
    public Client save (Client clt){
        return clientCrudRepository.save(clt);
    }

    public void delete(Client clt){
        clientCrudRepository.delete(clt);
    }
        
}
