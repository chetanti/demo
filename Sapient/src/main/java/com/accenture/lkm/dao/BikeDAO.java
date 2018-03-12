package com.accenture.lkm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.lkm.entity.BikeEntity;


public interface BikeDAO  extends JpaRepository<BikeEntity, Integer>{

	
}
