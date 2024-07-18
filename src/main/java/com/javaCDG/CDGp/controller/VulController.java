package com.javaCDG.CDGp.controller;

import com.javaCDG.CDGp.entities.Vul;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController("/controller")
public class VulController {

    @Autowired
    @GetMapping
    public List<Vul> getAllUsers() {
        // Logique pour récupérer toutes les vulnerabilites
        return null;
    }

    // Logique pour creer une nouvelle vul
    @PostMapping
    public ResponseEntity<Vul> createUser(@RequestBody Vul vul) {

        return null;
    }

    // Logique pour mettre à jour une vul existante
    @PutMapping("/{Id}")
    public ResponseEntity<Vul> updateVul(@PathVariable Long Id, @RequestBody Vul vul) {

        return null;
    }

    // Logique pour supprimer une vul

    @DeleteMapping("/{id}")
//    @DeleteMapping("/vul/{id}")
    public ResponseEntity<Void> deleteVul(@PathVariable Long id) {
        return null;
    }
}
