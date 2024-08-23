package com.mintoclub.air.reservation.service;

import com.mintoclub.air.reservation.dto.AirlineDTO;
import com.mintoclub.air.reservation.model.Airline;

import java.util.List;
import java.util.Optional;

public interface AirlineService {
     List<Airline> findAll();
     Optional<Airline> findById(int id);
     Optional<Airline> findByAirlineName(String name);
     Optional<Airline> findByAirlineCode(String code);
     Airline save(AirlineDTO airlineDTO);
     Airline update(AirlineDTO airlineDTO);
     void deleteById(int airlineId);

}
