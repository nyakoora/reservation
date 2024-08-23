package com.mintoclub.air.reservation.controller;

import com.mintoclub.air.reservation.dto.AirlineDTO;
import com.mintoclub.air.reservation.model.Airline;
import com.mintoclub.air.reservation.service.AirlineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/airlines")
public class AirlineController {

    private final AirlineService airlineService;

    @GetMapping
    public ResponseEntity<List<Airline>> findAll() {
        return ResponseEntity.ok(airlineService.findAll());
    }

    @PostMapping
    public ResponseEntity<Airline> save(@RequestBody AirlineDTO airlineDTO) {
        return new ResponseEntity<>(airlineService.save(airlineDTO), HttpStatus.CREATED);
    }
}
