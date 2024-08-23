package com.mintoclub.air.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "airline")
public class Airline implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id

    @GeneratedValue
    private int id;
    private String airlineCode;
    private String airlineName;

}
