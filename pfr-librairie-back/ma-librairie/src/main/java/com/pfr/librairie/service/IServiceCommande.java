package com.pfr.librairie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfr.librairie.entity.CommandeEntity;

@Service
public interface IServiceCommande {

    CommandeEntity getCommandeById( int pId );

    List<CommandeEntity> getAll( int pageEnCours );

    Object count();

    CommandeEntity addCommande( CommandeEntity pCommande );

    void delete( int idToDelete );

    boolean existe( int id );

}
