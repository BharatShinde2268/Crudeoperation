package com.main.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Hotel;
import com.main.exceptions.ResourceNotFoundExceptions;
import com.main.repo.HotelRepository;
import com.main.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository repository;
	
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		String uuid = UUID.randomUUID().toString();
		hotel.setId(uuid);
		Hotel save = repository.save(hotel);
		return save;
	}

	@Override
	public void deleteHotel(String id) {
		Hotel deleted = repository.findById(id).orElseThrow(()-> new ResourceNotFoundExceptions("Hotel Not Found On Server"));
		repository.delete(deleted);
	}

	@Override
	public Hotel getSingleHotes(String id) {
		Hotel single = repository.findById(id).orElseThrow(()-> new ResourceNotFoundExceptions("Hotel Not Found On Server"));
	
		return single;
	}

	@Override
	public List<Hotel> getAllHotel() {
		List<Hotel> findAll = repository.findAll();
		return findAll;
	}

}
