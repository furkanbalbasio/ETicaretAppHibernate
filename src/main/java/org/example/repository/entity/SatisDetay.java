package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_satis_detay")
public class SatisDetay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long satisId;
    Long urunId;
    BigDecimal fiyat;
    Integer adet;
    BigDecimal toplamFiyat;
    @Embedded
    BaseEntity baseEntity;
}
