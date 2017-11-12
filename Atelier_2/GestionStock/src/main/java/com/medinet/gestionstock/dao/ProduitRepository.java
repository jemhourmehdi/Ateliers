package com.medinet.gestionstock.dao;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medinet.gestionstock.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
	
	@Query("select p from Produit p where p.nom like %:nom%")
	Collection<Produit> findAllByNom(@Param("nom") String nom);
	
	@Query("select p from Produit p where p.prix between :p1 and :p2")
	Page<Produit> findAllByPrixBetween(@Param("p1") double prix1 ,@Param("p2") double prix2, Pageable pageable);
	
	
}
