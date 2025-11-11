package com.example.SOA.controller;

import com.example.SOA.model.Fidelite;
import com.example.SOA.service.FideliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fidelite")
public class FideliteController {

    @Autowired
    private FideliteService fideliteService;

    // Créer une nouvelle fidélité
    @PostMapping("/create")
    public ResponseEntity<Fidelite> createFidelite(@RequestBody Fidelite fidelite) {
        Fidelite createdFidelite = fideliteService.createFidelite(fidelite);
        return ResponseEntity.ok(createdFidelite);
    }


    // Récupérer toutes les fidélités
    @GetMapping
    public List<Fidelite> getAllFidelites() {
        return fideliteService.getAllFidelites();
    }
    // Lire une fidélité par ID
    @GetMapping("/{id}")
    public ResponseEntity<Fidelite> getFideliteById(@PathVariable Long id) {
        Fidelite fidelite = fideliteService.getFideliteById(id);
        if (fidelite != null) {
            return ResponseEntity.ok(fidelite);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Mettre à jour une fidélité
    @PutMapping("/{id}")
    public ResponseEntity<Fidelite> updateFidelite(@PathVariable Long id, @RequestBody Fidelite fideliteDetails) {
        Fidelite updatedFidelite = fideliteService.updateFidelite(id, fideliteDetails);
        if (updatedFidelite != null) {
            return ResponseEntity.ok(updatedFidelite);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Supprimer une fidélité
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFidelite(@PathVariable Long id) {
        fideliteService.deleteFidelite(id);
        return ResponseEntity.noContent().build();
    }

    // Trouver une fidélité par client ID
    @GetMapping("/client/{clientId}")
    public ResponseEntity<Fidelite> getFideliteByClientId(@PathVariable Long clientId) {
        Fidelite fidelite = fideliteService.getFideliteByClientId(clientId);
        if (fidelite != null) {
            return ResponseEntity.ok(fidelite);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
