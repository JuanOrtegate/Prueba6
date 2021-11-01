package com.example.reto.demojuanc.repository.crud;

import com.example.reto.demojuanc.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository <Message, Integer>{
    
}
