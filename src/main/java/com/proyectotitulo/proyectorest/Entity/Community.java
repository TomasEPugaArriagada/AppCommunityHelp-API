package com.proyectotitulo.proyectorest.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Community {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Community;
    private String name_Community;
    @OneToMany(mappedBy = "community", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Publication> publications = new HashSet<>();
    @ManyToMany(mappedBy = "community")
    private Set<User> members = new HashSet<>();



    public Long getId_Community() {
        return id_Community;
    }
    public void setId_Community(Long id_Community) {
        this.id_Community = id_Community;
    }
    
    public Set<Publication> getPublications() {
        return publications;
    }
    public void setPublications(Set<Publication> publications) {
        this.publications = publications;
    }
    public String getName_Community() {
        return name_Community;
    }
    public void setName_Community(String name_Community) {
        this.name_Community = name_Community;
    }
    public Set<User> getMembers() {
        return members;
    }
    public void setMembers(Set<User> members) {
        this.members = members;
    }

    
}
