package com.mintoclub.air.reservation.mapper;


import com.mintoclub.air.reservation.dto.FlightDTO;

import com.mintoclub.air.reservation.model.Flight;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FlightMapper {
    FlightMapper INSTANCE = Mappers.getMapper(FlightMapper.class);

    @Mapping(target = "id", ignore = true)
    Flight toFlight(FlightDTO flightDTO);

    FlightDTO toFlightDTO(Flight flight);


}
