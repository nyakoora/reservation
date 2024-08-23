package com.mintoclub.air.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AirportDTO {
    private String iataCode;
    private String airportName;
    private String city;
    private String stateOrProvince;
    private String country;
}
