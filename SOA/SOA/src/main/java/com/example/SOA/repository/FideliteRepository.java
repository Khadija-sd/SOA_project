package com.example.SOA.repository;

import com.example.SOA.model.Fidelite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FideliteRepository extends JpaRepository<Fidelite, Long> {

    // Méthode personnalisée pour trouver un client par son ID
    Fidelite findByClientId(Long clientId);  // Cette méthode est générée automatiquement

}
