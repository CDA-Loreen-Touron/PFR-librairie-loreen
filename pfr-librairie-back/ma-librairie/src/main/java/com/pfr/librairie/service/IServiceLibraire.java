package com.pfr.librairie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfr.librairie.entity.LibraireEntity;

@Service
public interface IServiceLibraire {
    LibraireEntity getLibraireByEmail( String pEmail );

    List<LibraireEntity> getAll( int pageEnCours );

    LibraireEntity addLibraire( LibraireEntity pLibraire );

    void delete( String email );

    boolean existe( String email );
}
