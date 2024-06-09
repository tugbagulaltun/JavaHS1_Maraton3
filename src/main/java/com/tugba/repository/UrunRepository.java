package com.tugba.repository;

import com.tugba.entity.Urun;
import com.tugba.entity.enums.Beden;
import com.tugba.entity.enums.Cinsiyet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrunRepository extends JpaRepository<Urun,Long> {
    List<Urun> findAll();

    List<Urun> findAllByAdLikeIgnoreCase(String urunAdi);

    List<Urun> getAllByCinsiyetAndBeden(String urunAdi);


    List<Urun> findAllByCinsiyetAndBeden(Cinsiyet cinsiyet, Beden beden);
}
