package com.pfr.librairie.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfr.librairie.dao.IDaoClient;
import com.pfr.librairie.entity.ClientEntity;
import com.pfr.librairie.service.IServiceClient;

@Service
public class ClientServiceImpl implements IServiceClient {

    @Autowired
    private IDaoClient     clientDao;

    @Autowired
    private IServiceClient serviceClient;

    @Autowired
    private ModelMapper    modelMapper;

    @Override
    public ClientEntity getClientByEmail( String email ) {
        ClientEntity monClientDto = new ClientEntity();

        return monClientDto;
    }

    @Override
    public ClientEntity getClientByName( String nom ) {
        ClientEntity monClientDto = new ClientEntity();

        return monClientDto;
    }

    @Override
    public List<ClientEntity> getAll( int pageEnCours ) {
        List<ClientEntity> maListe = new ArrayList<ClientEntity>();
        maListe = clientDao.findAll();
        return maListe;

    }

    @Override
    public Object count() {
        return this.clientDao.count();
    }

    @Override
    public ClientEntity addClient( ClientEntity client ) {
        ClientEntity client2 = new ClientEntity();

        client2.setNom( client.getNom() );
        client2.setPrenom( client.getPrenom() );
        client2.setEmail( client.getEmail() );
        client2.setPwd( client.getPwd() );
        // client2.setAdresse( pClient.getAdresse() );
        client2.setTelephone( client.getTelephone() );

        return client2;
    }

    @Override
    public void add( String nom, String prenom, String email ) {
        this.clientDao
                .save( ClientEntity.builder().nom( nom ).prenom( prenom ).email( email ) );

    }

    @Override
    public boolean emailExiste( String email ) {
        Optional<ClientEntity> res = this.clientDao.findByEmail( email );
        return res.isPresent();
    }

    @Override
    public void delete( String email ) {
        this.clientDao.deleteByEmail( email );

    }

    @Override
    public void save( ClientEntity c1 ) {
        this.clientDao.save( c1 );

    }

    @Override
    public ArrayList findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    // @Override
    // public void create( ClientDto client ) {
    // // TODO Auto-generated method stub
    //
    // }
    //
    // @Override
    // public void create( ClientEntity clientEntity ) {
    // // TODO Auto-generated method stub
    //
    // }

    // @Override
    // public void create( ClientREntoi client ) {
    // // TODO Auto-generated method stub
    //
    // }
    //
    // @Override
    // public ClientEntity create( ClientEntity client ) {
    // // TODO Auto-generated method stub
    // return null;
    // }

}
