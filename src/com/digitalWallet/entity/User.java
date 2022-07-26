package com.digitalWallet.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class User {
    private String id;
    private String username;

    public User(String name){
        this.id = UUID.randomUUID().toString().replace("-","");
        this.username = name;
    }

}
