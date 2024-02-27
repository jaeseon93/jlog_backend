package com.js.jlog_backend.service.trip;

import com.js.jlog_backend.dto.trip.TripRequestDto;

public interface TripService {

    /**
     * 여행추가
     * @param dto dto
     * @return 성공1 실패0
     */
    int addTrip(TripRequestDto dto);
}
