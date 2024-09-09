package com.proyectotitulo.proyectorest.Controller;

import org.springframework.web.bind.annotation.*;

import com.proyectotitulo.proyectorest.Entity.Publication;
import com.proyectotitulo.proyectorest.Repository.PublicationRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.*;


@RestController
@RequestMapping("/Publications")
public class PublicationController {
    

    @Autowired
    private PublicationRepository publicationRepository;

    @GetMapping()
    public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }
    
}
