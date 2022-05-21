package com.example.algalogapi.entities;

import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
//@Entity
//@Table(name = "tb_client")
public class Client {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    
    public Client(){}

    public Client(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
}
