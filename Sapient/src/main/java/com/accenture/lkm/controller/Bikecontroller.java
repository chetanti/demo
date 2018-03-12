package com.accenture.lkm.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.lkm.model.Bike;
import com.accenture.lkm.service.BikeServiceImpl;

@RestController
public class Bikecontroller {

	@Autowired
	private BikeServiceImpl bikeServiceImpl;
	
	
	@RequestMapping(value="test",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public String getString(){
		System.out.println("inside get");
		Collection <Bike> listBike = bikeServiceImpl.getBikeDetails();
		System.out.println(listBike);
		return "Hello";
	}
	
	@RequestMapping(value="bike/controller/getDetails",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Bike>> getBikeDetails(){
		System.out.println("inside get");
		Collection <Bike> listBike = bikeServiceImpl.getBikeDetails();
		System.out.println(listBike);
		return new ResponseEntity<Collection<Bike>>(listBike, HttpStatus.OK);
	}
	
	@RequestMapping(value="bike/controller/getDetailsById/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bike> getBikeDetailByBikeId(@PathVariable("id") int myId){
		Bike Bike = bikeServiceImpl.getBikeDetailsById(myId);
		
		if(Bike!=null)
		{
			return new ResponseEntity<Bike>(Bike,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Bike>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="bike/controller/addBike",
			method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String> addBike( @RequestBody Bike Bike){
		System.out.println(" inside add------");
		int id= bikeServiceImpl.addBike(Bike);
		System.out.println("[id]:"+id);
		return new ResponseEntity<String>("Bike added successfully with id:"+id,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/bike/controller/updateBike",
			method=RequestMethod.PUT,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bike> updateBike(@RequestBody Bike Bike){
		Bike Bike2= bikeServiceImpl.updateBikeDetail(Bike);
		if(Bike2==null){
			return new ResponseEntity<Bike>(Bike2,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		System.out.println(Bike);
		return new ResponseEntity<Bike>(Bike2,HttpStatus.OK);
	}
	@RequestMapping(value="/bike/controller/deleteBike/{id}",
			method=RequestMethod.DELETE,
			//consumes=MediaType.TEXT_PLAIN_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bike> deleteBike(@PathVariable("id") int myId){
		Bike Bike= bikeServiceImpl.deleteBike(myId);
		if(Bike==null){
			return new ResponseEntity<Bike>(Bike,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		System.out.println("Removed: "+Bike);
		return new ResponseEntity<Bike>(Bike,HttpStatus.OK);
	}
}
