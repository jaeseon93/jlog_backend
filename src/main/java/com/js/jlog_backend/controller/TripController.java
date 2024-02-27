package com.js.jlog_backend.controller;

import com.js.jlog_backend.dto.trip.TripRequestDto;
import com.js.jlog_backend.service.trip.TripService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class TripController {

    private final TripService tripService;

    @PostMapping("/trip")
    public ResponseEntity<Integer> hello(@RequestBody TripRequestDto dto) {
        log.info("tripDto {}", dto);
        return ResponseEntity.ok(tripService.addTrip(dto));
    }

}
