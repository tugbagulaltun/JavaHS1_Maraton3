package com.tugba.mapper;

import com.tugba.dto.request.UrunOzellikSaveRequestDto;
import com.tugba.entity.UrunOzellik;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UrunOzellikMapper {
    UrunOzellikMapper INSTANCE = Mappers.getMapper(UrunOzellikMapper.class);


    UrunOzellik fromUrunOzellikDto(UrunOzellikSaveRequestDto dto);
}
