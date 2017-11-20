package com.gestionbanque.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Comptes implements Serializable {

    private double decouverte;

    public CompteCourant(String codeCompte, Date dateCreation, double solde, Clients client, double decouverte) {
        super(codeCompte, dateCreation, solde, client);
        this.decouverte = decouverte;
    }

    public double getDecouverte() {
        return decouverte;
    }

    public void setDecouverte(double decouverte) {
        this.decouverte = decouverte;
    }
}
