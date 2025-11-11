package com.example.SOA.service;

import com.example.SOA.model.Fidelite;
import com.example.SOA.repository.FideliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.time.LocalDateTime;

@Service
public class FideliteService {

    @Autowired
    private FideliteRepository fideliteRepository;

    // Créer une nouvelle fidélité
    public Fidelite createFidelite(Fidelite fidelite) {
        fidelite.setDateCreation(LocalDateTime.now());
        fidelite.setDateModification(LocalDateTime.now());
        return fideliteRepository.save(fidelite);
    }


     // Récupérer toutes les fidélités
    public List<Fidelite> getAllFidelites() {
        return fideliteRepository.findAll();  // Méthode findAll() de JpaRepository
    }
    // Lire une fidélité par son ID
    public Fidelite getFideliteById(Long id) {
        return fideliteRepository.findById(id).orElse(null); // Retourne null si non trouvé
    }

    // Mettre à jour une fidélité
    public Fidelite updateFidelite(Long id, Fidelite fideliteDetails) {
        Fidelite fidelite = fideliteRepository.findById(id).orElse(null);
        if (fidelite != null) {
            fidelite.setPoints(fideliteDetails.getPoints());
            fidelite.setNiveauFidelite(fideliteDetails.getNiveauFidelite());
            fidelite.setDateModification(LocalDateTime.now());
            return fideliteRepository.save(fidelite);
        }
        return null;
    }

    // Supprimer une fidélité
    public void deleteFidelite(Long id) {
        fideliteRepository.deleteById(id);
    }

    // Trouver une fidélité par client ID
    public Fidelite getFideliteByClientId(Long clientId) {
        return fideliteRepository.findByClientId(clientId);
    }
}
