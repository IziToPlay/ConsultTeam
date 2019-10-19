package com.cruzSolar.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cruzSolar.model.entity.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long>{

}
