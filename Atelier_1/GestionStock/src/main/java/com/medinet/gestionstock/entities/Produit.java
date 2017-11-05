package com.medinet.gestionstock.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable{
	
	@Id @GeneratedValue
	private Long id;
	@Column(name="NOM", length=30)
	private String nom;
	private double prix;
	private String photo;
	
	
	public Produit() {
		super();
	}


	public Produit(String nom, double prix, String photo) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.photo = photo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", prix=" + prix + ", photo=" + photo + "]";
	}
	
	

}
