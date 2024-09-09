package com.proyectotitulo.proyectorest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectotitulo.proyectorest.Entity.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> {

    
}
