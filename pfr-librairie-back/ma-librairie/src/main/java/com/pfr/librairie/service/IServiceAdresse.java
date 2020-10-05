package com.pfr.librairie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfr.librairie.entity.AdresseEntity;

@Service
public interface IServiceAdresse {

    AdresseEntity getAdresseById( int id );

    List<AdresseEntity> getAll( int pageEnCours );

    Object count();

    AdresseEntity addAdresse( AdresseEntity pAdresse );

    void delete( int id );

    boolean existe( int id );

}
