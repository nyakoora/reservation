package com.mintoclub.air.reservation.controller;

import com.mintoclub.air.reservation.dto.FlightDTO;
import com.mintoclub.air.reservation.model.Flight;
import com.mintoclub.air.reservation.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/flights")
public class FlightController {

    private final FlightService flightService;

    @GetMapping
    public ResponseEntity<List<Flight>> findAll() {
        return ResponseEntity.ok(flightService.findAll());
    }

    @PostMapping
    public ResponseEntity<Flight> save(@RequestBody FlightDTO flightDTO) {
        return new ResponseEntity<>(flightService.save(flightDTO), HttpStatus.CREATED);
    }
}
