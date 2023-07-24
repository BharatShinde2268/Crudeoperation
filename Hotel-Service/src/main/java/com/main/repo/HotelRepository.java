package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
