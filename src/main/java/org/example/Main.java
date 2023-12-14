package org.example;

import org.example.criteriaornekleri.CriteriaOrnekleri;
import org.example.enums.ECinsiyet;
import org.example.repository.UrunRepository;
import org.example.repository.entity.*;
import org.example.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CriteriaOrnekleri cr=new CriteriaOrnekleri();
       // cr.findAllNameMativeQuery().forEach(System.out::println);
        cr.findAllByAd("%a%").forEach(System.out::println);

//        List<Object[]> result=new CriteriaOrnekleri().selectManyColumn();
//        result.forEach(x->{
//            System.out.println("id: "+x[0]);
//            System.out.println("ad: "+x[1]);
//            System.out.println("fiyat: "+x[2]);
//        });
//        Musteri musteri=new Musteri();
//        musteri.setAd("Muhammet");
//        musteri.setSoyad("Karakaya");
//        musteri.setCinsiyet(ECinsiyet.ERKEK);


        //  new CriteriaOrnekleri().findById(3L);
      //  new CriteriaOrnekleri().selectOneColumnById(2l);
      //  new CriteriaOrnekleri().selectOneColumn();
        //       new CriteriaOrnekleri().findAll();
//        BaseEntity baseEntity= BaseEntity.builder()
//                .state(1)
//                .createAt(System.currentTimeMillis())
//                .updateAt(System.currentTimeMillis())
//                .isActive(true)
//                .build();
//        UrunRepository urunRepository=new UrunRepository();
//        urunRepository.save(Urun.builder().
//                baseEntity(baseEntity)
//                .stok(300)
//                .fiyat(BigDecimal.valueOf(2_350))
//                .ad("Bilgisayar")
//                .barkod("524332423423")
//                .marka("Asus")
//                .model("X595V")
//                .build());
//        Session session=HibernateUtility.getSessionFactory().openSession();
//        Transaction tt=session.beginTransaction();

//        Urun urunSeker= Urun.builder()
//                .ad("Şeker")
//                .fiyat(BigDecimal.valueOf(200))
//                .stok(20)
//                .baseEntity(baseEntity)
//                .build();
//        Urun urunYag= Urun.builder()
//                .ad("Yag")
//                .fiyat(BigDecimal.valueOf(20))
//                .stok(100)
//                .baseEntity(baseEntity)
//                .build();
//
//        session.save(urunYag);
//        session.save(urunSeker);
//
//        Satis satis=Satis.builder()
//                .musteriId(1L)
//                .date(System.currentTimeMillis())
//                .baseEntity(baseEntity)
//                .toplamTutar(BigDecimal.valueOf(500))
//                .build();
//        session.save(satis);
//
//        SatisDetay satisDetaySeker=SatisDetay.builder()
//                .urunId(1L)
//                .fiyat(BigDecimal.valueOf(20))
//                .adet(5)
//                .toplamFiyat(BigDecimal.valueOf(100))
//                .baseEntity(baseEntity)
//                .satisId(1L)
//                .build();
//
//        SatisDetay satisDetayYag=SatisDetay.builder()
//                .urunId(2L)
//                .fiyat(BigDecimal.valueOf(200))
//                .adet(2)
//                .toplamFiyat(BigDecimal.valueOf(400))
//                .baseEntity(baseEntity)
//                .satisId(1L)
//                .build();
//
//        session.save(satisDetaySeker);
//        session.save(satisDetayYag);
//        tt.commit();
//        session.close();
//


//        Iletisim iletisim=Iletisim.builder()
//                .adres("Istanbul")
//                .cepTelefonu("12324567")
//                .email("muhammet@hoca.com")
//                .build();
//
//        Musteri musteri=new Musteri();
//        musteri.setAd("Muhammet");
//        musteri.setSoyad("Karakaya");
//        musteri.setIletisim(iletisim);
//        musteri.setBaseEntity(baseEntity);
//        musteri.setAdsoyad(musteri.getAd()+" "+musteri.getSoyad());
//        musteri.setCinsiyet(ECinsiyet.ERKEK);
//        musteri.setDogumTarihi(new Date());
//        musteri.setKayitTarihi(new Timestamp(System.currentTimeMillis()));
//        musteri.setTelefonListesi(Arrays.asList("1234567789","08812736162"));
////        Musteri musteri=new Musteri();
////        musteri.builder().ad("Muhammet")
////                .id(1L)
////                .adres("Istanbul")
////                .soyad("Karakaya");
////        musteri.setAd("Muhammet");
////        musteri.setSoyad("Karakaya");
////        musteri.setAdsoyad(musteri.getAd()+" "+musteri.getSoyad());
////        musteri.setAdres("Istanbul");
////        musteri.setDogumTarihi(new Date());
////        musteri.setKayitTarihi(new Timestamp(System.currentTimeMillis()));
////        musteri.setCinsiyet(ECinsiyet.ERKEK);
////        musteri.setCreateAt(System.currentTimeMillis());
////        musteri.setTelefonListesi(Arrays.asList("1234567789","08812736162"));
//
//        Session ss=HibernateUtility.getSessionFactory().openSession();
//        Transaction transaction=ss.beginTransaction();
//        ss.save(musteri);
//        transaction.commit();
//        ss.close();
    }
}