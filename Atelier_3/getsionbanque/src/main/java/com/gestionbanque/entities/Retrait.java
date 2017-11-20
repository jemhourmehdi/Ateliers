package com.gestionbanque.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operations implements Serializable {

    public Retrait(Date dateOperation, double montant, Comptes comptes) {
        super(dateOperation, montant, comptes);
    }
}
