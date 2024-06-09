package com.tugba.mapper;

import com.tugba.dto.request.MarkaSaveRequestDto;
import com.tugba.entity.Marka;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper( componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MarkaMapper {
    MarkaMapper INSTANCE = Mappers.getMapper(MarkaMapper.class);

    Marka fromMarkaSaveDto(MarkaSaveRequestDto dto);
}
