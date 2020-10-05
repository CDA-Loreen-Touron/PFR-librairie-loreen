package com.pfr.librairie.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfr.librairie.dao.IDaoAdresse;
import com.pfr.librairie.entity.AdresseEntity;
import com.pfr.librairie.service.IServiceAdresse;

@Service
public class AdresseServiceImpl implements IServiceAdresse {

    @Autowired
    private IDaoAdresse     adresseDao;

    @Autowired
    private IServiceAdresse serviceAdresse;

    @Override
    public AdresseEntity getAdresseById( int id ) {
        AdresseEntity monAdresseDto = new AdresseEntity();

        return monAdresseDto;
    }

    @Override
    public List<AdresseEntity> getAll( int pageEnCours ) {
        List<AdresseEntity> maListe = new ArrayList<AdresseEntity>();
        maListe = adresseDao.findAll();
        return maListe;
    }

    @Override
    public Object count() {
        return this.adresseDao.count();
    }

    @Override
    public AdresseEntity addAdresse( AdresseEntity pAdresse ) {
        AdresseEntity adresse2 = new AdresseEntity();

        adresse2.setNumero( pAdresse.getNumero() );
        adresse2.setRue( pAdresse.getRue() );
        adresse2.setCp( pAdresse.getCp() );
        adresse2.setVille( pAdresse.getVille() );
        adresse2.setComplement( pAdresse.getComplement() );

        return adresse2;
    }

    @Override
    public void delete( int id ) {
        this.adresseDao.deleteById( id );

    }

    @Override
    public boolean existe( int id ) {
        Optional<AdresseEntity> res = this.adresseDao.findById( id );
        return res.isPresent();
    }

}
