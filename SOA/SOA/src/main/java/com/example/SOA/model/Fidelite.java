package com.example.SOA.model;

import jakarta.persistence.*; // Utiliser jakarta.persistence pour Spring Boot 2.x et plus
import java.time.LocalDateTime;

@Entity
@Table(name = "fidelite")  // Nom de la table dans la base de données
public class Fidelite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-incrémentation de l'ID
    private Long id;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "points")
    private int points;

    @Column(name = "niveau_fidelite")
    private String niveauFidelite;

    @Column(name = "date_creation")
    private LocalDateTime dateCreation;

    @Column(name = "date_modification")
    private LocalDateTime dateModification;

    @Column(name = "points_acquis")
    private int pointsAcquis;

    @Column(name = "points_utilises")
    private int pointsUtilises;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getNiveauFidelite() {
        return niveauFidelite;
    }

    public void setNiveauFidelite(String niveauFidelite) {
        this.niveauFidelite = niveauFidelite;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDateTime getDateModification() {
        return dateModification;
    }

    public void setDateModification(LocalDateTime dateModification) {
        this.dateModification = dateModification;
    }

    public int getPointsAcquis() {
        return pointsAcquis;
    }

    public void setPointsAcquis(int pointsAcquis) {
        this.pointsAcquis = pointsAcquis;
    }

    public int getPointsUtilises() {
        return pointsUtilises;
    }

    public void setPointsUtilises(int pointsUtilises) {
        this.pointsUtilises = pointsUtilises;
    }
}
