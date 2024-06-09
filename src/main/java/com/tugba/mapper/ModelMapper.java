package com.tugba.mapper;

import com.tugba.dto.request.ModelSaveRequestDto;
import com.tugba.entity.Model;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.Banner;

@Mapper( componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ModelMapper {
    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);

    Model fromModelSaveDto(ModelSaveRequestDto dto);
}
