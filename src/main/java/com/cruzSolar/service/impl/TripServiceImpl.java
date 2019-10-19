package com.cruzSolar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruzSolar.model.entity.Trip;
import com.cruzSolar.model.repository.TripRepository;
import com.cruzSolar.service.TripService;

@Service
public class TripServiceImpl implements TripService{

	@Autowired
	private TripRepository tripRepository;
	
	@Override
	public List<Trip> getAll() {
		return tripRepository.findAll();
	}

	@Override
	public Trip getOneById(Long id) {
		return tripRepository.findById(id).orElseThrow(() -> new RuntimeException("Trip Not Found!"));	}

	@Override
	public Long create(Trip entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long id, Trip entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
