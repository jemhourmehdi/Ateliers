package com.gestionbanque.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Clients implements Serializable{

    @Id @GeneratedValue
    private Long codeClient;
    private String nom;
    private String email;
    @OneToMany(mappedBy = "client")
    private Collection<Comptes> comptes;

    public Clients(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Comptes> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Comptes> comptes) {
        this.comptes = comptes;
    }
}
