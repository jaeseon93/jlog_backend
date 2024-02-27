package com.js.jlog_backend.service;

import com.js.jlog_backend.dto.trip.TripRequestDto;
import com.js.jlog_backend.repository.trip.TripMapper;
import com.js.jlog_backend.service.trip.TripService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TripServiceImpl implements TripService {

    private final TripMapper tripMapper;

    /**
     * 여행추가
     * @param dto dto
     * @return 성공1 실패0
     */
    @Override
    @Transactional
    public int addTrip(TripRequestDto dto) {
        int result = 0;
        if(!dto.getCountry().isEmpty()) {
            result = tripMapper.addTrip(dto);
            log.info("result {}", result);
        }
        return result;
    }
}
