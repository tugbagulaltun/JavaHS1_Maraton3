package com.tugba.service;

import com.tugba.dto.request.UrunSaveRequestDto;
import com.tugba.entity.Urun;
import com.tugba.entity.enums.Beden;
import com.tugba.entity.enums.Cinsiyet;
import com.tugba.mapper.UrunMapper;
import com.tugba.repository.UrunRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UrunService {
    private final UrunRepository urunRepository;

    public Urun save(UrunSaveRequestDto dto) {
        return urunRepository.save(UrunMapper.INSTANCE.fromUrunSaveDto(dto));
    }
    public List<Urun> getAll() {
        return urunRepository.findAll();
    }
    public List<Urun> getAllUrunAdi(String urunAdi){
        return urunRepository.findAllByAdLikeIgnoreCase(urunAdi);
    }

    public List<Urun> getAllByCinsiyetAndBeden(Cinsiyet cinsiyet, Beden beden) {
        return urunRepository.findAllByCinsiyetAndBeden(cinsiyet, beden);
    }


}
