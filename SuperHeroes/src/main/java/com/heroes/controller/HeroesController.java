package com.heroes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heroes.entity.HeroesEntity;
import com.heroes.service.HeroesService;

@RestController
@CrossOrigin
public class HeroesController {

	@Autowired
	private HeroesService heroesService;
	
//	@GetMapping("/name")
//	public String[] getHeroesNames() {
//	return heroesService.getHeroesNames();// ->heroesEntity 
//	
//	
//	}
//	
//	@GetMapping("/Info")
//	public String[] getHeroesInfo() {
//	return heroesService.getHeroesInfo();// ->heroesEntity 
//	
//	
//	}
	@GetMapping("/name")
	public List<HeroesEntity> getHeroesNames() {
	return heroesService.getHeroesNames();// ->heroesEntity 
	
	
	}
	
	@GetMapping("/info")
	public List<HeroesEntity> getHeroesInfo() {

	return heroesService.getHeroesInfo();// ->heroesEntity 
	
	
	}
	
}
