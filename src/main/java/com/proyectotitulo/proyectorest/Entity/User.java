package com.proyectotitulo.proyectorest.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_User;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;

    @ManyToMany
    @JoinTable(
        name = "User_Community",
        joinColumns = @JoinColumn( name = "id_user"),
        inverseJoinColumns = @JoinColumn( name = "id_community") 
    )
    
    private Set<Community> community = new HashSet<>();

    public Long getId_User() {
        return id_User;
    }
    public void setId_User(Long id_User) {
        this.id_User = id_User;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Set<Community> getCommunity() {
        return community;
    }
    public void setCommunity(Set<Community> community) {
        this.community = community;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    


    

}
