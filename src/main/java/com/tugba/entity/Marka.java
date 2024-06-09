package com.tugba.entity;

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
@Table(name = "tblmarka")
public class Marka {
    @Id //Long id nin primarykey olduğunu belirtmek için kullanılır.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id için otomatik artan bir HB sequence oluşturur.
    Long id;
    private String markaAd;
}
