package org.example.criteriaornekleri;

import org.example.repository.entity.Musteri;
import org.example.repository.entity.Urun;
import org.example.repository.views.VwUrun;
import org.example.utility.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.math.BigDecimal;
import java.util.List;

public class CriteriaOrnekleri {

    private EntityManager entityManager;
    private CriteriaBuilder criteriaBuilder;

    public CriteriaOrnekleri(){

        entityManager= HibernateUtility.getSessionFactory().createEntityManager();
        criteriaBuilder=entityManager.getCriteriaBuilder();
    }
    public List<Musteri> findAll(){

        CriteriaQuery<Musteri> criteria=criteriaBuilder.createQuery(Musteri.class);

        Root<Musteri> root=criteria.from(Musteri.class);
        criteria.select(root);
        List<Musteri> musteriList=entityManager.createQuery(criteria).getResultList();
        musteriList.forEach(System.out::println);
        return musteriList;
    }
    public List<String> selectOneColumn(){
        CriteriaQuery<String> criteria=criteriaBuilder.createQuery(String.class);
        Root<Urun> root=criteria.from(Urun.class);
        criteria.select(root.get("ad"));
        List<String> musteriList=entityManager.createQuery(criteria).getResultList();
        musteriList.forEach(System.out::println);
        return musteriList;
    }
    public List<String> selectOneColumnById(Long id){
        CriteriaQuery<String> criteria=criteriaBuilder.createQuery(String.class);
        Root<Urun> root=criteria.from(Urun.class);
        criteria.select(root.get("ad"));
        criteria.where(criteriaBuilder.equal(root.get("id"),id));
        List<String> musteriList=entityManager.createQuery(criteria).getResultList();
        musteriList.forEach(System.out::println);
        return musteriList;
    }

    public Urun findById(Long id){
        CriteriaQuery<Urun> criteria=criteriaBuilder.createQuery(Urun.class);
        Root<Urun> root=criteria.from(Urun.class);
        criteria.select(root);
        criteria.where(criteriaBuilder.equal(root.get("id"),id));
        Urun result=entityManager.createQuery(criteria).getSingleResult();
        System.out.println(result);
        return result;
    }
    public List<Object[]> selectManyColumn(){
        CriteriaQuery<Object[]> criteria=criteriaBuilder.createQuery(Object[].class);
        Root<Urun> root=criteria.from(Urun.class);

        Path<Long> id=root.get("id");
        Path<String> ad=root.get("ad");
        Path<BigDecimal> fiyat=root.get("fiyat");

        criteria.select(criteriaBuilder.array(id,ad,fiyat));

        List<Object[]> result=entityManager.createQuery(criteria).getResultList();
        result.forEach(System.out::println);
        return result;
    }
    public List<Urun> findAllByNameLikeAndFiyatGreaterThan(String urunAdi,BigDecimal fiyat){
        CriteriaQuery<Urun> criteria=criteriaBuilder.createQuery(Urun.class);
        Root<Urun> root=criteria.from(Urun.class);
        criteria.select(root);

        Predicate s1=criteriaBuilder.like(root.get("ad"),urunAdi);
        Predicate s2=criteriaBuilder.greaterThan(root.get("fiyat"),fiyat);

        criteria.where(criteriaBuilder.and(s1,s2));

        List<Urun> result=entityManager.createQuery(criteria).getResultList();
        return result;
    }

    public List<Urun> findAllNativeQuery(){
       List<Urun> uruns=entityManager.createNativeQuery("SELECT * FROM tbl_urun", Urun.class).getResultList();
        return uruns;
    }
    public List<VwUrun> findAllNameMativeQuery(){
        List<VwUrun> result=entityManager.createNativeQuery("SELECT id,ad FROM tbl_urun",VwUrun.class).getResultList();
        return result;
    }

    public List<Urun> findAllNamedQuery(){
      TypedQuery<Urun> namedQuery= entityManager.createNamedQuery("Urun.findAll",Urun.class);
      return namedQuery.getResultList();
    }
    public List<Urun> findAllByAd(String urunadi){
        TypedQuery<Urun> namedQuery= entityManager.createNamedQuery("Urun.findByAd",Urun.class);
        namedQuery.setParameter("urunadi",urunadi);
        return namedQuery.getResultList();
    }
    public BigDecimal getTotalPrice(){
        TypedQuery<BigDecimal> namedQuery= entityManager.createNamedQuery("Urun.getTotalPrice",BigDecimal.class);
        return namedQuery.getSingleResult() ;
    }
}
