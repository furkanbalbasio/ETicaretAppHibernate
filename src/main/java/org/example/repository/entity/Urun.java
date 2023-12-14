package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;



@NamedQuery(name="Urun.findAll",query = "select u from Urun u")//bunun uzerinden sorgu yazilabilir
@NamedQueries({
             @NamedQuery(name="Urun.findAll",query = "select u from Urun u"),
             @NamedQuery(name="Urun.findAll",query = "select u from Urun u where u.ad like :urunAdi")
} )
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_urun")
public class Urun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String barkod;
    String marka;
    String model;
    BigDecimal fiyat;
    Integer stok;
    @Embedded
    BaseEntity baseEntity;
}
