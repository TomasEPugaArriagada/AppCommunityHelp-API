package com.proyectotitulo.proyectorest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectotitulo.proyectorest.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    
}