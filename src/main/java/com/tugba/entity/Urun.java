package com.tugba.entity;

import com.tugba.entity.enums.Beden;
import com.tugba.entity.enums.Cinsiyet;
import com.tugba.service.UrunService;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // get - set - to string
@AllArgsConstructor // parametreli consturctorların tümü
@NoArgsConstructor // default constructor
@Builder //
@Entity
@Table(name = "tblurun")
public class Urun {
    @Id //Long id nin primarykey olduğunu belirtmek için kullanılır.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id için otomatik artan bir HB sequence oluşturur.
    Long id;
    private String ad;
    private String renk;
    private Double fiyat;
    private Integer stok;
    private Beden beden;
    private Cinsiyet cinsiyet;
    private String aciklama;

    private String anaResimURL;
    @OneToMany(mappedBy = "urun", cascade = CascadeType.ALL)
    @Size(max = 3)
    private List<String> altResimURL;


    @OneToMany(mappedBy = "urun", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UrunOzellik> urunOzellikleri;
    @ManyToOne
    private Marka marka;
    @ManyToOne
    private Model model;



}
