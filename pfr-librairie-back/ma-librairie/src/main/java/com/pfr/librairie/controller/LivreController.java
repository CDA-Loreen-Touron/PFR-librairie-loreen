// package com.pfr.librairie.controller;
//
// import java.util.ArrayList;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;
//
// import com.pfr.librairie.entity.LivreEntity;
// import com.pfr.librairie.service.IServiceLivre;
//
// import lombok.extern.slf4j.Slf4j;
//
// @Slf4j
// @Controller
// public class LivreController {
//
// @Autowired
// IServiceLivre livreService;
//
// @GetMapping( value = "/chercherLivre" )
// public String chercherLivre() {
// return "chercherLivre";
// }
//
// @PostMapping( value = "/chercherLivre" )
// public ResponseEntity<String> chercherLivre(
//
// @RequestParam( value = "titre" ) String titre ) {
//
// log.trace( "titre : " + titre );
// log.debug( "LivreController ajout de titre: {} ", titre );
// ResponseEntity<String> reponse = null;
//
// if ( titre == null || ( titre = titre.trim() ).length() == 0
//
// )
//
// {
//
// reponse = ResponseEntity.badRequest()
// .body( "Le champ titre est obligatoire" );
// }
//
// return reponse;
//
// }
//
// @GetMapping( value = "/chercherLivre" )
// public ModelAndView afficherTous() {
// ArrayList<LivreEntity> livres = (ArrayList<LivreEntity>)
// livreService.findAll();
// ModelAndView mv = new ModelAndView();
// mv.setViewName( "chercherLivre" );// nvelle page jsp à créer
// mv.addObject( "livres", livres );
// return mv;
// }
// }

// @RequestMapping( value = { "/chercherLivre" }, method = { RequestMethod.POST,
// RequestMethod.GET } )
// protected ModelAndView listerLivres( @RequestParam( value = "page",
// defaultValue = "1" ) int pageEnCours ) {
// log.debug( "list livres" );
//
// ModelAndView model = new ModelAndView();// va faire le lien avec la jsp
//
// List<LivreEntity> vLivres = this.livreService.getAll( pageEnCours );
//
// model.addObject( "livres", vLivres );// "clients" on va se servir de
// // ce nom dans la jsp
// model.addObject( "nbElementsParPage", Constantes.ELEMENTS_PAR_PAGE );
// model.addObject( "count", this.livreService.count() );
// model.addObject( "pageEnCours", pageEnCours );
//
// model.setViewName( "chercherLivre" );
// return model;
// }
//
// @RequestMapping( value = "/chercherLivre", method = RequestMethod.POST )
// public ResponseEntity<String> validationAjout(
// @RequestParam( value = "id" ) int id,
// @RequestParam( value = "titre" ) String titre,
// @RequestParam( value = "auteur" ) String auteur,
// @RequestParam( value = "format" ) String format ) {
//
// log.trace( "id : " + id );
// log.debug( "LivreController ajout de titre: {} et auteur: {}", titre, auteur
// );
//
// ResponseEntity<String> res;
//
// if ( titre == null || ( titre = titre.trim() ).length() == 0
// || auteur == null || ( auteur = auteur.trim() ).length() == 0
// || format == null || ( format = format.trim() ).length() == 0 )
//
// {
// res = ResponseEntity.badRequest()
// .body( "Tous les champs sont obligatoires" );
//
// } else {
// this.livreService.existe( id );
//
// res = ResponseEntity.badRequest()
// .body( "Ce livre existe déjà!" );
//
// }
// res = ResponseEntity.badRequest()
// .body( "Ce livre a bien été ajouté" );
// return res;
// }
//
// @RequestMapping( value = "/livres/{id}", method = RequestMethod.DELETE )
// public ResponseEntity<String> validationSuppression( @PathVariable( value =
// "id" ) int id ) {
//
// log.debug( "suppression : {} ", id );
// ResponseEntity<String> res;
//
// if ( !this.livreService.existe( id ) ) {
// log.warn( "ce livre n'est pas référencé !" );
// res = ResponseEntity.status( HttpStatus.NOT_FOUND ).body( "ce livre n'est pas
// référencé !" );
//
// } else {
// this.livreService.delete( id );
// res = ResponseEntity.ok( "suppression avec succés" );
//
// log.info( "suppression avec succés" );
// }
//
// return res;
// }
//
// }