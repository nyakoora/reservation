package com.mintoclub.air.reservation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "flight")
public class Flight implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "flight_id")
    private Long id;

    @Column(name ="flight_no")
    private String flightNo;

    @Column(name ="departure_date_time")
    private LocalDateTime departureDateTime;

    @Column(name = "arrival_date_time")
    private LocalDateTime arrivalDateTime;

    @Column(name = "departure_airport_iata_code")
    private String departureAirportIataCode;

    @Column(name = "arrival_airport_iata_code")
    private String arrivalAirportIataCode;

    private LocalDate creationDateTime;
    private LocalDate updateDateTime;





}
