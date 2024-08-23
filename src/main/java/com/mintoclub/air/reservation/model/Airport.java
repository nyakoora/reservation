package com.mintoclub.air.reservation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "airport")
public class Airport implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "airport_id")
    private int id;// Example 1.

    @Column(name = "iata_code")
    private String iataCode;//Example EWR.

    @Column(name = "airport_name")
    private String airportName;// Example Newark Liberty Intl.
    private String city;// Example New York.
    private String stateOrProvince;
    private String country;// Example United States of America.

}
