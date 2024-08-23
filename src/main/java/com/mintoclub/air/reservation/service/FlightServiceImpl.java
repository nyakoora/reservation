package com.mintoclub.air.reservation.service;

import com.mintoclub.air.reservation.dto.FlightDTO;
import com.mintoclub.air.reservation.mapper.FlightMapper;
import com.mintoclub.air.reservation.model.Flight;
import com.mintoclub.air.reservation.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FlightServiceImpl implements FlightService {
    private final FlightRepository flightRepository;
    /**
     * @return
     */
    @Override
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Flight> findById(long id) {
        return flightRepository.findById(id);
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Optional<Flight> findByFlightNo(String name) {
        return flightRepository.findByFlightNo(name);
    }

    /**
     * @param flightDTO
     * @return
     */
    @Override
    public Flight save(FlightDTO flightDTO) {
        Flight flight = FlightMapper.INSTANCE.toFlight(flightDTO);
        return flightRepository.save(flight);
    }

    /**
     * @param flightDTO
     * @return
     */
    @Override
    public Flight update(FlightDTO flightDTO) {
        Flight flight = FlightMapper.INSTANCE.toFlight(flightDTO);
        return flightRepository.save(flight);
    }

    /**
     * @param id
     */
    @Override
    public void deleteById(long id) {
        flightRepository.deleteById(id);
    }
}
