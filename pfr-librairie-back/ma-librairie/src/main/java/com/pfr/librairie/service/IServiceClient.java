package com.pfr.librairie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pfr.librairie.dto.ClientDto;
import com.pfr.librairie.entity.ClientEntity;

@Service
public interface IServiceClient {

    ClientEntity getClientByEmail( String email );

    ClientEntity getClientByName( String nom );

    List<ClientEntity> getAll( int pageEnCours );

    Object count();

    ClientEntity addClient( ClientEntity client );

    void add( String nom, String prenom, String email );

    boolean emailExiste( String email );

    void delete( String email );

    void save( ClientEntity c1 );

    ArrayList findAll();

    void create( ClientDto client );

}
