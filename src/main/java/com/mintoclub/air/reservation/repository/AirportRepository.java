package com.mintoclub.air.reservation.repository;

import com.mintoclub.air.reservation.model.Airline;
import com.mintoclub.air.reservation.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AirportRepository extends JpaRepository<Airport, Integer> {
    Optional<Airport> findByIataCode(String code);

    Optional<Airport> findByAirportName(String airportName);
}
