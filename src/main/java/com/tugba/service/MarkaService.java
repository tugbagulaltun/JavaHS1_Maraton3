package com.tugba.service;

import com.tugba.dto.request.MarkaSaveRequestDto;
import com.tugba.entity.Marka;
import com.tugba.mapper.MarkaMapper;
import com.tugba.repository.MarkaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkaService {
    private final MarkaRepository markaRepository;

    public Marka save(MarkaSaveRequestDto dto) {
        return markaRepository.save(MarkaMapper.INSTANCE.fromMarkaSaveDto(dto));
    }
}
