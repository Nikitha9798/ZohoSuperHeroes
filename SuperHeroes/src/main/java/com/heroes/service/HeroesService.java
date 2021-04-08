package com.heroes.service;

import java.util.List;

import com.heroes.entity.HeroesEntity;

public interface HeroesService {
	
	List<HeroesEntity> getHeroesInfo();
	
	List<HeroesEntity> getHeroesNames();

}
