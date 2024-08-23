package com.mintoclub.air.reservation.repository;

import com.mintoclub.air.reservation.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FlightRepository extends JpaRepository<Flight, Long> {


    Optional<Flight> findByFlightNo(String  flightNo);
}
