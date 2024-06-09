package com.tugba.entity;

import com.tugba.entity.enums.Beden;
import com.tugba.entity.enums.Cinsiyet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get - set - to string
@AllArgsConstructor // parametreli consturctorların tümü
@NoArgsConstructor // default constructor
@Builder //
@Entity
@Table(name = "tblurunozellik")
public class UrunOzellik {
    @Id //Long id nin primarykey olduğunu belirtmek için kullanılır.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id için otomatik artan bir HB sequence oluşturur.
    Long id;
    @Column(name = "kategori_adi")
    private String kategoriAdi;
    @Column(name = "ozellik_adi")
    private String ozellikAdi;
    private String aciklama;

    @ManyToOne
    @JoinColumn(name="urun_id")
    private Urun urun;
}
