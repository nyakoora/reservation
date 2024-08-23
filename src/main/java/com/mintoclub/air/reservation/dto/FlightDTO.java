package com.mintoclub.air.reservation.dto;


import com.mintoclub.air.reservation.model.Airport;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightDTO {
    private String flightNo;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private String departureAirportIataCode;
    private String arrivalAirportIataCode;
    private LocalDate creationDateTime;
    private LocalDate updateDateTime;
}
