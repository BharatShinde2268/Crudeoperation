package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.models.Rating;
import com.main.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService service;
	
	@PostMapping("/create")
	public ResponseEntity<Rating> create(@RequestBody Rating rating)
	{
		//Rating createRating = service.createRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createRating(rating)); 
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Rating>> getRatings()
	{
		return ResponseEntity.ok(service.getAllRating());
	}
	
	
	@GetMapping("/all/userId/{userId}")
	public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId)
	{
		return ResponseEntity.ok(service.getRatingByUserId(userId));
	}
	
	@GetMapping("/all/hotelId/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId)
	{
		return ResponseEntity.ok(service.getRatingByHotelId(hotelId));
	}
	
	
	
}
