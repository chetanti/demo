package com.accenture.lkm.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.dao.BikeDAO;
import com.accenture.lkm.entity.BikeEntity;
import com.accenture.lkm.model.Bike;

@Service
public class BikeServiceImpl {

	@Autowired
	private BikeDAO bikeDao;
	
	
	public int addBike(Bike bike){
		System.out.println("add bike ");
		BikeEntity bikeEntity = new BikeEntity();
		bikeEntity.setBikeId(bike.getBikeId());
		bikeEntity.setBikeName(bike.getBikeName());
		bikeEntity.setPrice(bike.getPrice());
		bikeEntity.setCompany(bike.getCompany());
		System.out.println(bikeEntity.toString());
		BikeEntity bikeObj = (BikeEntity)bikeDao.save(bikeEntity);
		System.out.println("bike created details " + bikeObj);
		return bikeObj.getBikeId();
	}
	
	
	public Collection<Bike> getBikeDetails(){
		Collection<BikeEntity> collec =bikeDao.findAll();
		List<Bike> listBike = new ArrayList<Bike> ();
		for (BikeEntity bikeEntity : collec) {
			Bike bike=new Bike();
			BeanUtils.copyProperties(bikeEntity, bike);
			listBike.add(bike);
		}
		
		return listBike;
	}
	
	public Bike getBikeDetailsById(int id){
		Bike bike = null;
		System.out.println("id---"+ id);
		BikeEntity bikeEntity = bikeDao.findById(id).get();
//				findOne(id);
		if(bikeEntity != null){
			bike = new Bike();
			BeanUtils.copyProperties(bikeEntity, bike);
		}
			
		System.out.println(" bike obj " + bike);
		return bike;
		
	}
	
	public Bike deleteBike(int bikeId){
		Bike bike = null;
		
		BikeEntity bikeEntity = bikeDao.findById(bikeId).get();
		if(bikeEntity != null){
			bikeDao.delete(bikeEntity);
			bike = new Bike();
			BeanUtils.copyProperties(bikeEntity, bike);
		}
		System.out.println(" deleted the obj " + bike);
		return bike;
	}
	
	public Bike updateBikeDetail(Bike bike){
		Bike bike2 = null;
		
		System.out.println("---"+ bike.getBikeId());
		BikeEntity bikeEntity = bikeDao.findById(bike.getBikeId()).get();
		
		if(bikeEntity!= null){
			
			System.out.println(" entity " +bikeEntity.getBikeId());
			BeanUtils.copyProperties(bike, bikeEntity);
			
			bikeDao.save(bikeEntity);
			
			bike2 = new Bike();
			BeanUtils.copyProperties(bikeEntity, bike2);
		}
		System.out.println(" updated bike obj " + bike2);
		return bike2;
	}
}
