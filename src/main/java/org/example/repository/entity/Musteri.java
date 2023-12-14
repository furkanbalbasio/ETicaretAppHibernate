package org.example.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.ECinsiyet;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tblmusteri")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Musteri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//sq_tblmusteri_id->initial=1,inc=1
    Long id;
//    @Id
//    @SequenceGenerator(name = "seq_musteri_id",sequenceName = "seq_musteri_id",initialValue = 100,allocationSize = 5)
//    //Sequence tanimi yaptik.
//    @GeneratedValue(generator = "seq_musteri_id")//tanimlanmis olan sequence i ilgili alana atiyoruz.
//    Long m_id;
//    //@Id
//    @GenericGenerator(name = "uuid_musteri",strategy = "uuid2")
//    @GeneratedValue(generator = "uuid_musteri")
//    UUID uuid;

    @Column(
            name = "musteri_adi",//kolonun DB deki adi ozellestiriliyor.
            length = 60,//kolonun boyutunu belirliyoruz.
            nullable = false, //bu alanin null gecilebilip gecilemeyecegini belirliyorum false->null gecilemez
            unique = false, //bu alanin benzersiz olup olmadigini belirliyorsunuz.true->bir daha kayit edilemez.
            insertable = true, //bu alana ekleme yapilmasini kisitlamak icin kullaniriz. false-> bu alana kayit eklenemez.
            updatable = false //bu alanin guncellemesi durumunu kisitliyoruz. false->guncelleme yapamaz.
    )
    String ad;
    @Column(length = 100)
    String soyad;


    @Transient
    String adsoyad;

    @Temporal(TemporalType.DATE)
    Date dogumTarihi;
    @Temporal(TemporalType.DATE)
    Date iseGirisTarihi;
    @Temporal(TemporalType.TIMESTAMP)
    Date kayitTarihi;

   // Long createAt;

    @ElementCollection
    List<String> telefonListesi;

    @Enumerated(EnumType.STRING)
    ECinsiyet cinsiyet;

//    Long createAt;
//    Long updateAt;
//    Integer state;
//    boolean isActive;
    @Embedded
    BaseEntity baseEntity;

    @Embedded
    Iletisim iletisim;

}
