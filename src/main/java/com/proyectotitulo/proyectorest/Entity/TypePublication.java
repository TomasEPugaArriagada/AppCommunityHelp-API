package com.proyectotitulo.proyectorest.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TypePublication {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_typePublication;
    private String nameTypePublication;

    public Long getId_typePublication() {
        return id_typePublication;
    }
    public void setId_typePublication(Long id_typePublication) {
        this.id_typePublication = id_typePublication;
    }
    public String getNameTypePublication() {
        return nameTypePublication;
    }
    public void setNameTypePublication(String nameTypePublication) {
        this.nameTypePublication = nameTypePublication;
    }
    
    
}
