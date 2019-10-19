package com.cruzSolar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruzSolar.model.entity.Ticket;
import com.cruzSolar.model.repository.TicketRepository;
import com.cruzSolar.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public List<Ticket> getAll() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket getOneById(Long id) {
		return ticketRepository.findById(id).orElseThrow(() -> new RuntimeException("Ticket Not Found!"));
	}

	@Override
	public Long create(Ticket entity) {
		ticketRepository.save(entity);
		return entity.getId();
	}

	@Override
	public void update(Long id, Ticket entity) {
     
	}

	@Override
	public void delete(Long id) {
      ticketRepository.deleteById(id);
	}
		
}
