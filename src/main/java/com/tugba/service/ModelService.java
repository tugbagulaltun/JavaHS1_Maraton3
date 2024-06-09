package com.tugba.service;

import com.tugba.dto.request.ModelSaveRequestDto;
import com.tugba.entity.Model;
import com.tugba.mapper.ModelMapper;
import com.tugba.repository.ModelRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelService {
    private final ModelRepository modelRepository;

    public Model save(ModelSaveRequestDto dto) {
        return modelRepository.save(ModelMapper.INSTANCE.fromModelSaveDto(dto));
    }
}
