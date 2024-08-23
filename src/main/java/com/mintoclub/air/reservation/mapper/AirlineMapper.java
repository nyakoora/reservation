package com.mintoclub.air.reservation.mapper;

import com.mintoclub.air.reservation.dto.AirlineDTO;
import com.mintoclub.air.reservation.model.Airline;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AirlineMapper {

    AirlineMapper INSTANCE = Mappers.getMapper(AirlineMapper.class);
    @Mapping(target = "id", ignore = true)
    Airline toAirline(AirlineDTO airlineDTO);

    AirlineDTO toAirlineDTO(Airline airline);

}
