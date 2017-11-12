package com.medinet.gestionstock.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medinet.gestionstock.dao.ProduitRepository;

@Controller
@RequestMapping("/produits")
public class ProduitsController {

	@Autowired
	private ProduitRepository produitRepository;
	
	
	@GetMapping("/")
	public String index(Model model){
		model.addAttribute("produits", produitRepository.findAll());
		return "produits";
	}
}
