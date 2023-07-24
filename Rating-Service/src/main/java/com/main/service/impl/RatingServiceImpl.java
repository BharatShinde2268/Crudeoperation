package com.main.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.models.Rating;
import com.main.repository.RatingRepository;
import com.main.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository repository;
	
	@Override
	public Rating createRating(Rating rating) {
		String uui = UUID.randomUUID().toString();
		rating.setRatingId(uui);
		Rating save = repository.save(rating);
		return save;
	}

	@Override
	public List<Rating> getAllRating() {
		List<Rating> findAll = repository.findAll();
		
		return findAll;
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		List<Rating> findByUserId = repository.findByUserId(userId);
	
		return findByUserId;
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		List<Rating> findByHotelId = repository.findByHotelId(hotelId);
		return findByHotelId;
	}


}
