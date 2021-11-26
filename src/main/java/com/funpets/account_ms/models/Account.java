package com.funpets.account_ms.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Account {
    @Id
    private String nickname;
    private String nombre;
    private Date edad;
    private String especie;
    private String description;
    private String username;

    public Account(String username, String nickname, String nombre, Date edad, String especie, String description) {
        this.username = username;
        this.nickname = nickname;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.description = description;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(){
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
