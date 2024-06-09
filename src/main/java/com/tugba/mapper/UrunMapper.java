package com.tugba.mapper;

import com.tugba.dto.request.UrunSaveRequestDto;
import com.tugba.entity.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper( componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UrunMapper {
    UrunMapper INSTANCE= Mappers.getMapper(UrunMapper.class);

    Urun fromUrunSaveDto(UrunSaveRequestDto dto);
}
