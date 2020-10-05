package com.pfr.librairie.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfr.librairie.dao.IDaoLibraire;
import com.pfr.librairie.entity.LibraireEntity;
import com.pfr.librairie.service.IServiceLibraire;

@Service
public class LibraireServiceImpl implements IServiceLibraire {

    @Autowired
    private IDaoLibraire     libraireDao;

    @Autowired
    private IServiceLibraire serviceLibraire;

    @Autowired
    private ModelMapper      modelMapper;

    @Override
    public LibraireEntity getLibraireByEmail( String pEmail ) {
        LibraireEntity monLibraireDto = new LibraireEntity();

        return monLibraireDto;
    }

    @Override
    public List<LibraireEntity> getAll( int pageEnCours ) {
        List<LibraireEntity> maListe = new ArrayList<LibraireEntity>();
        maListe = libraireDao.findAll();
        return maListe;
    }

    @Override
    public LibraireEntity addLibraire( LibraireEntity pLibraire ) {
        LibraireEntity libraire = new LibraireEntity();

        libraire.setNom( pLibraire.getNom() );
        libraire.setPrenom( pLibraire.getPrenom() );
        libraire.setEmail( pLibraire.getEmail() );
        libraire.setPwd( pLibraire.getPwd() );

        return libraire;
    }

    @Override
    public void delete( String email ) {
        this.libraireDao.deleteByEmail( email );

    }

    @Override
    public boolean existe( String email ) {
        Optional<LibraireEntity> res = this.libraireDao.findByEmail( email );
        return res.isPresent();
    }

}
