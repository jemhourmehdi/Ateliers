package com.gestionbanque.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operations implements Serializable {

    public Versement(Date dateOperation, double montant, Comptes comptes) {
        super(dateOperation, montant, comptes);
    }
}
