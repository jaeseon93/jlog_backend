package com.js.jlog_backend.dto.trip;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TripRequestDto {

    private String country;

    private String city;

    private String airline;

    private String airport;

    private int price;

    private String departureDttm;

    private String arriveDttm;


}
