package com.example.algalogapi.controllers;

import com.example.algalogapi.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @GetMapping
    public ResponseEntity<List<Client>> findAllClients(){
        Client client1 = new Client(1L, "Erick Oliveira", "erick@gmai.com");
        Client client = new Client(2L, "Murilo Oliveira", "murilo@gmai.com");

        List<Client> list = new ArrayList<>();
        list.add(client);
        list.add(client1);
        return ResponseEntity.ok(list);
    }

}
