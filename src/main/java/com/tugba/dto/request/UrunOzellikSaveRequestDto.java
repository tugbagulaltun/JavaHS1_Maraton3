package com.tugba.dto.request;

import com.tugba.entity.Urun;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class UrunOzellikSaveRequestDto {
    String kategoriAdi;
    String ozellikAdi;
    String aciklama;
    Urun urun;
}
