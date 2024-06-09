package com.tugba.dto.request;

import com.tugba.entity.Marka;
import com.tugba.entity.Model;
import com.tugba.entity.UrunOzellik;
import com.tugba.entity.enums.Cinsiyet;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // get - set - to string
@AllArgsConstructor // parametreli consturctorların tümü
@NoArgsConstructor // default constructor
@Builder //
public class UrunSaveRequestDto {
    @NotNull
    String ad;
    String renk;
    Double fiyat;
    String beden;
    @NotNull
    Integer stok;
    Cinsiyet cinsiyet;
    String aciklama;
    @NotNull
    Marka marka;
    @NotNull
    Model model;
    @NotNull
    List<UrunOzellik> urunOzellikleri;
    @NotNull
    String anaResimURL;
    @NotNull
    @Min(value = 1)
    @Max(value = 3)
    String altResimURL;



}
