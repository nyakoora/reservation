package com.mintoclub.air.reservation.service;

import com.mintoclub.air.reservation.dto.AirlineDTO;
import com.mintoclub.air.reservation.mapper.AirlineMapper;
import com.mintoclub.air.reservation.model.Airline;
import com.mintoclub.air.reservation.repository.AirlineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AirlineServiceImpl implements AirlineService {

    private final AirlineRepository airlineRepository;

    /**
     * @return a list of all the airlines from the repository.
     */
    @Override
    public List<Airline> findAll() {
        return airlineRepository.findAll();
    }

    /**
     * @param id must not be null.
     * @return the airline object from repository.
     */
    @Override
    public Optional<Airline> findById(int id) {
        return airlineRepository.findById(id);
    }

    /**
     * @param name by airlineName.
     * @return the airlineName from the repository.
     */
    @Override
    public Optional<Airline> findByAirlineName(String name) {
        return airlineRepository.findByAirlineName(name);
    }

    /**
     * @param code
     * @return
     */
    @Override
    public Optional<Airline> findByAirlineCode(String code) {
        return airlineRepository.findByAirlineCode(code);
    }

    /**
     * @param airlineDTO
     * @return
     */
    @Override
    public Airline save(AirlineDTO airlineDTO) {
        Airline airline = AirlineMapper.INSTANCE.toAirline(airlineDTO);
        return airlineRepository.save(airline);
    }

    /**
     * @param airlineDTO
     * @return
     */
    @Override
    public Airline update(AirlineDTO airlineDTO) {
        Airline airline = AirlineMapper.INSTANCE.toAirline(airlineDTO);
        return airlineRepository.save(airline);
    }

    /**
     * @param airlineId
     */
    @Override
    public void deleteById(int airlineId) {
        airlineRepository.deleteById(airlineId);
    }
}
