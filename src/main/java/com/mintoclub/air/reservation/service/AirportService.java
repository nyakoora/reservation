package com.mintoclub.air.reservation.service;

import com.mintoclub.air.reservation.dto.AirportDTO;
import com.mintoclub.air.reservation.model.Airport;

import java.util.List;
import java.util.Optional;

public interface AirportService {
    List<Airport> findAll();
    Optional<Airport> findById(int id);
    Optional<Airport> findByIataCode(String iataCode);
    Optional<Airport> findByAirportName(String name);
    Airport save(AirportDTO airportDTO);
    Airport update(AirportDTO airportDTO);
    void deleteById(int airportId);



}
