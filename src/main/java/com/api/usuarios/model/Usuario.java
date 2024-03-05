package com.api.usuarios.model;

import java.util.UUID;
public class Usuario {
    private UUID id;
    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
