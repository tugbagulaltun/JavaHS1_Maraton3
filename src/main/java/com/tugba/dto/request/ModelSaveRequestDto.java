package com.tugba.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get - set - to string
@AllArgsConstructor // parametreli consturctorların tümü
@NoArgsConstructor // default constructor
@Builder //
public class ModelSaveRequestDto {
    String modelAd;
}
