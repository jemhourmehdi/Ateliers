package com.medinet.gestionstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;

import com.medinet.gestionstock.dao.ProduitRepository;
import com.medinet.gestionstock.entities.Produit;

@SpringBootApplication
public class GestionStockApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(GestionStockApplication.class, args);
		ProduitRepository metier= ctx.getBean(ProduitRepository.class);
		
//		metier.save(new Produit("Produit 1", 5010, "Image Produit 1"));
//		metier.save(new Produit("Produit 2", 10, "Image Produit 2"));
//		metier.save(new Produit("Produit 3", 810, "Image Produit 3"));
//		metier.save(new Produit("Produit 4", 50, "Image Produit 4"));
		
//		for(Produit produit:metier.findAllByNom("prod")){
//			System.out.println(produit.toString());
//		}
		
		for(Produit produit:metier.findAllByPrixBetween(50, 1000, new PageRequest(1, 1)))
		{
			System.out.println(produit.toString());
		}
	}
}
