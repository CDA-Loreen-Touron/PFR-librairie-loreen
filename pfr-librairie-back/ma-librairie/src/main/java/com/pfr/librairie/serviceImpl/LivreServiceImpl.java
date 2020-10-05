// package com.pfr.librairie.serviceImpl;
//
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;
//
// import org.modelmapper.ModelMapper;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
//
// import com.pfr.librairie.dao.IDaoLivre;
// import com.pfr.librairie.entity.LivreEntity;
// import com.pfr.librairie.service.IServiceLivre;
//
// @Service
// public class LivreServiceImpl implements IServiceLivre {
//
// @Autowired
// private IDaoLivre livreDao;
//
// @Autowired
// private IServiceLivre serviceLivre;
//
// @Autowired
// private ModelMapper modelMapper;
//
// @Override
// public LivreEntity getLivreById( int pId ) {
// LivreEntity monLivreDto = new LivreEntity();
// return monLivreDto;
// }
//
// @Override
// public LivreEntity findLivreByTitre( int pTitre ) {
// LivreEntity monLivreDto = new LivreEntity();
// return monLivreDto;
// }
//
// @Override
// public LivreEntity getLivreByTitre( String pTitre ) {
// LivreEntity monLivreDto = new LivreEntity();
// return monLivreDto;
// }
//
// @Override
// public List<LivreEntity> getAll( int pageEnCours ) {
// List<LivreEntity> maListe = new ArrayList<LivreEntity>();
// maListe = livreDao.findAll();
// return maListe;
// }
//
// @Override
// public Object count() {
// return this.livreDao.count();
// }
//
// @Override
// public LivreEntity addLivre( LivreEntity pLivre ) {
// LivreEntity livre = new LivreEntity();
//
// livre.setId( pLivre.getId() );
// livre.setTitre( pLivre.getTitre() );
// livre.setAuteur( pLivre.getAuteur() );
// livre.setFormat( pLivre.getFormat() );
// // livre.setEnStock( pLivre.isEnStock()
//
// return livre;
// }
//
// @Override
// public void delete( int id ) {
// this.livreDao.deleteById( id );
//
// }
//
// @Override
// public boolean existe( int id ) {
// Optional<LivreEntity> res = this.livreDao.findById( id );
// return res.isPresent();
// }
//
// @Override
// public void save( LivreEntity l1 ) {
// // TODO Auto-generated method stub
//
// }
//
// @Override
// public ArrayList<LivreEntity> findAll() {
// List<LivreEntity> listeLivre = new ArrayList<LivreEntity>();
// listeLivre = livreDao.findAll();
// return (ArrayList<LivreEntity>) listeLivre;
// }
//
// }
