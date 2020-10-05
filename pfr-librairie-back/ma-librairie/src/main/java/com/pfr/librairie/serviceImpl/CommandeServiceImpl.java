package com.pfr.librairie.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfr.librairie.dao.IDaoCommande;
import com.pfr.librairie.entity.CommandeEntity;
import com.pfr.librairie.service.IServiceCommande;

@Service
public class CommandeServiceImpl implements IServiceCommande {

    @Autowired
    private IDaoCommande     commandeDao;

    @Autowired
    private IServiceCommande serviceCommande;

    @Autowired
    private ModelMapper      modelMapper;

    @Override
    public CommandeEntity getCommandeById( int pId ) {
        CommandeEntity maCommandetDto = new CommandeEntity();

        return maCommandetDto;
    }

    @Override
    public List<CommandeEntity> getAll( int pageEnCours ) {
        List<CommandeEntity> maListe = new ArrayList<CommandeEntity>();
        maListe = commandeDao.findAll();
        return maListe;
    }

    @Override
    public Object count() {
        return this.commandeDao.count();
    }

    @Override
    public CommandeEntity addCommande( CommandeEntity pCommande ) {
        CommandeEntity commande = new CommandeEntity();

        commande.setId( pCommande.getId() );
        // commande.setLivre( pCommande.getLivre() );
        commande.setNombreLivre( pCommande.getNombreLivre() );
        commande.setTimeStamp( pCommande.getTimeStamp() );

        return commande;
    }

    @Override
    public void delete( int id ) {
        this.commandeDao.deleteById( id );

    }

    @Override
    public boolean existe( int id ) {
        Optional<CommandeEntity> res = this.commandeDao.findById( id );
        return res.isPresent();
    }

}
