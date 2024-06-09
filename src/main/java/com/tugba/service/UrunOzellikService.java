package com.tugba.service;

import com.tugba.dto.request.UrunOzellikSaveRequestDto;
import com.tugba.entity.UrunOzellik;
import com.tugba.mapper.UrunOzellikMapper;
import com.tugba.repository.UrunOzellikRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UrunOzellikService {
    private final UrunOzellikRepository urunOzellikRepository;

    public UrunOzellik save(UrunOzellikSaveRequestDto dto) {
        return urunOzellikRepository.save(UrunOzellikMapper.INSTANCE.fromUrunOzellikDto (dto));
    }
    public List<UrunOzellik> getAllUrunOzellik() {
        return urunOzellikRepository.findAll();
    }

    public List<UrunOzellik> getUrunOzellikByKategoriAndOzellik(String kategoriAdi, String ozellikAdi) {
        return urunOzellikRepository.findByKategoriAdiAndOzellikAdi(kategoriAdi, ozellikAdi);
    }

    public List<UrunOzellik> getUrunOzellikByKategori(String kategoriAdi) {
        return urunOzellikRepository.findByKategoriAdi(kategoriAdi);
    }

    public List<UrunOzellik> getUrunOzellikByOzellik(String ozellikAdi) {
        return urunOzellikRepository.findByOzellikAdi(ozellikAdi);
    }
}
