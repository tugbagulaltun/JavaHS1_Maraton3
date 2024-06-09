package com.tugba.repository;

import com.tugba.entity.UrunOzellik;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrunOzellikRepository extends JpaRepository<UrunOzellik, Long> {
    List<UrunOzellik> findByKategoriAdiAndOzellikAdi(String kategoriAdi, String ozellikAdi);

    List<UrunOzellik> findByKategoriAdi(String kategoriAdi);

    List<UrunOzellik> findByOzellikAdi(String ozellikAdi);
}
