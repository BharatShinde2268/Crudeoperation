package com.main.service;

import java.util.List;

import org.springframework.http.HttpStatusCode;

import com.main.entity.Hotel;

public interface HotelService {
	
	// create hotel
	
	public Hotel createHotel(Hotel hotel);
	
	
	// update hotel 
	
	
	// delete hotel 
	
	public void deleteHotel(String id);  
	
	
	// get single hotel 
	
	public Hotel getSingleHotes(String id);
	
	
	// get all hotels
	
	public List<Hotel> getAllHotel();

}
