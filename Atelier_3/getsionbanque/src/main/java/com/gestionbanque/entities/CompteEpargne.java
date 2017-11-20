package com.gestionbanque.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Comptes implements Serializable {

    private double taux;

    public CompteEpargne(String codeCompte, Date dateCreation, double solde, Clients client, double taux) {
        super(codeCompte, dateCreation, solde, client);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
