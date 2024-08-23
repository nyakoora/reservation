package com.mintoclub.air.reservation.repository;

import com.mintoclub.air.reservation.model.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AirlineRepository extends JpaRepository<Airline, Integer> {

    Optional<Airline> findByAirlineCode(String code);

    Optional<Airline> findByAirlineName(String airlineName);
}
