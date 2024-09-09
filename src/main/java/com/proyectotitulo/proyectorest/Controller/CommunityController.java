package com.proyectotitulo.proyectorest.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectotitulo.proyectorest.Entity.Community;
import com.proyectotitulo.proyectorest.Repository.CommunityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/Community")
public class CommunityController {

    @Autowired
    private CommunityRepository communityRepository;

    @GetMapping()
    public List<Community> getAllCommunitys() {
        return communityRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Community> getCommunityById(@PathVariable Long id) {
        return communityRepository.findById(id);
    }
    
    @GetMapping("Schema")
    public Community getCommunitySchema() {
        return new Community();
    }
    
}
