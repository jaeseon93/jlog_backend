package com.js.jlog_backend.repository.trip;

import com.js.jlog_backend.dto.trip.TripRequestDto;
import com.js.jlog_backend.dto.trip.TripResponseDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TripMapper {
    // 여행정보 리스트
    TripResponseDto getTrip();

    // 여행정보 추가
    int addTrip(TripRequestDto dto);
}
