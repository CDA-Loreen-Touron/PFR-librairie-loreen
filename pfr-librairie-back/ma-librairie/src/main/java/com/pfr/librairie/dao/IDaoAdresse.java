package com.pfr.librairie.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pfr.librairie.entity.AdresseEntity;

@Repository
public interface IDaoAdresse extends PagingAndSortingRepository<AdresseEntity, Integer> {
    @Autowired
    List<AdresseEntity> findAll();

    Optional<AdresseEntity> findById( int id );// optional = classe pour
                                               // recuperer les infos d'un objet

    Optional<AdresseEntity> deleteById( int id );

}
