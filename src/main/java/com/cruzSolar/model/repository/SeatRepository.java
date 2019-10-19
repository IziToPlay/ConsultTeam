package com.cruzSolar.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cruzSolar.model.entity.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long>{

}
