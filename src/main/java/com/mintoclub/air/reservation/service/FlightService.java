package com.mintoclub.air.reservation.service;

import com.mintoclub.air.reservation.dto.FlightDTO;
import com.mintoclub.air.reservation.model.Flight;

import java.util.List;
import java.util.Optional;

public interface FlightService {
    List<Flight> findAll();
    Optional<Flight> findById(long id);
    Optional<Flight> findByFlightNo(String name);
    Flight save(FlightDTO flightDTO);
    Flight update(FlightDTO flightDTO);
    void deleteById(long id);

}
