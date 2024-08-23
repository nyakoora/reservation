package com.mintoclub.air.reservation.controller;

import com.mintoclub.air.reservation.dto.AirlineDTO;
import com.mintoclub.air.reservation.dto.AirportDTO;
import com.mintoclub.air.reservation.model.Airline;
import com.mintoclub.air.reservation.model.Airport;
import com.mintoclub.air.reservation.service.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/airports")
public class AirportController {

    private final AirportService airportService;

    @GetMapping
    public ResponseEntity<List<Airport>> findAll() {
        return ResponseEntity.ok(airportService.findAll());
    }

    @PostMapping
    public ResponseEntity<Airport> save(@RequestBody AirportDTO airportDTO) {
        return new ResponseEntity<>(airportService.save(airportDTO), HttpStatus.CREATED);
    }
}
