package org.example.repository;

import org.example.repository.entity.Urun;

import org.example.utility.MyFactoryRepository;


public class UrunRepository extends MyFactoryRepository<Urun,Long> {
    public UrunRepository() {
        super(new Urun());
    }
}
