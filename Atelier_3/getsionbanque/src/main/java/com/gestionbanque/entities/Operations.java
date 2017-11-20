package com.gestionbanque.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Operation",discriminatorType = DiscriminatorType.STRING,length = 1)
public abstract class Operations implements Serializable{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numero;
    private Date dateOperation;
    private double montant;
    @ManyToOne
    @JoinColumn(name = "CodeCompte")
    private Comptes comptes;

    public Operations() {
    }

    public Operations(Date dateOperation, double montant, Comptes comptes) {
        this.dateOperation = dateOperation;
        this.montant = montant;
        this.comptes = comptes;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Comptes getComptes() {
        return comptes;
    }

    public void setComptes(Comptes comptes) {
        this.comptes = comptes;
    }
}
