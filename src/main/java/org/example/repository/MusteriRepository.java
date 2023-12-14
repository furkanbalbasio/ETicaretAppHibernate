package org.example.repository;

import org.example.repository.entity.Musteri;
import org.example.utility.MyFactoryRepository;


public class MusteriRepository extends MyFactoryRepository<Musteri,Long> {
    public MusteriRepository(){
        super(new Musteri());
    }

}
