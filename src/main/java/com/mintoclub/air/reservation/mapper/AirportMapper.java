package com.mintoclub.air.reservation.mapper;

import com.mintoclub.air.reservation.dto.AirportDTO;
import com.mintoclub.air.reservation.model.Airport;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AirportMapper {

    AirportMapper INSTANCE = Mappers.getMapper(AirportMapper.class);

    @Mapping(target = "id", ignore = true)
    Airport toAirport(AirportDTO airportDTO);

    AirportDTO toAirportDTO(Airport airport);

}
