package com.mintoclub.air.reservation.service;

import com.mintoclub.air.reservation.dto.AirportDTO;
import com.mintoclub.air.reservation.mapper.AirportMapper;
import com.mintoclub.air.reservation.model.Airport;
import com.mintoclub.air.reservation.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AirportServiceImpl implements AirportService {


    private final AirportRepository airportRepository;
    /**
     * @return
     */
    @Override
    public List<Airport> findAll() {
        return airportRepository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Airport> findById(int id) {
        return airportRepository.findById(id);
    }

    /**
     * @param iataCode
     * @return
     */
    @Override
    public Optional<Airport> findByIataCode(String iataCode) {
        return airportRepository.findByIataCode(iataCode);
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Optional<Airport> findByAirportName(String name) {
        return airportRepository.findByAirportName(name);
    }

    /**
     * @param airportDTO
     * @return
     */
    @Override
    public Airport save(AirportDTO airportDTO) {
        Airport airport = AirportMapper.INSTANCE.toAirport(airportDTO);
        return airportRepository.save(airport);
    }

    /**
     * @param airportDTO
     * @return
     */
    @Override
    public Airport update(AirportDTO airportDTO) {
        Airport airport = AirportMapper.INSTANCE.toAirport(airportDTO);
        return airportRepository.save(airport);
    }

    /**
     * @param airportId
     */
    @Override
    public void deleteById(int airportId) {
        airportRepository.deleteById(airportId);
    }
}
