package com.cruzSolar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruzSolar.model.entity.Bus;
import com.cruzSolar.model.repository.BusRepository;
import com.cruzSolar.service.BusService;

@Service
public class BusServiceImpl implements BusService{

	@Autowired
	private BusRepository busRepository;
	
	@Override
	public List<Bus> getAll() {
		return busRepository.findAll();
	}

	@Override
	public Bus getOneById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long create(Bus entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long id, Bus entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
