package com.pfr.librairie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pfr.librairie.entity.LibraireEntity;
import com.pfr.librairie.service.IServiceLibraire;
import com.pfr.librairie.tools.Constantes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LibraireController {
    @Autowired
    IServiceLibraire libraireService;

    @RequestMapping( value = { "/formulaireLibraire" }, method = { RequestMethod.POST, RequestMethod.GET } )
    protected ModelAndView listerLibraire( @RequestParam( value = "page", defaultValue = "1" ) int pageEnCours ) {
        log.debug( "list libraire" );

        ModelAndView model = new ModelAndView();// va faire le lien avec la jsp

        List<LibraireEntity> vLibraire = this.libraireService.getAll( pageEnCours );

        model.addObject( "libraires", vLibraire );// "clients" on va se servir
                                                  // de
                                                  // ce nom dans la jsp
        model.addObject( "nbElementsParPage", Constantes.ELEMENTS_PAR_PAGE );

        model.addObject( "pageEnCours", pageEnCours );

        model.setViewName( "formulaireLibraire" );//
        return model;
    }

    @RequestMapping( value = "/libraires", method = RequestMethod.POST )
    public ResponseEntity<String> validationAjout(
            @RequestParam( value = "prenom" ) String prenom,
            @RequestParam( value = "nom" ) String nom,
            @RequestParam( value = "email" ) String email,
            @RequestParam( value = "pwd" ) String pwd ) {

        log.trace( "email : " + email );
        log.debug( "LibraireController ajout de nom: {} et prenom: {}", nom, prenom );

        ResponseEntity<String> res;

        if ( nom == null || ( nom = nom.trim() ).length() == 0
                || prenom == null || ( prenom = prenom.trim() ).length() == 0
                || email == null || ( email = email.trim() ).length() == 0
                || pwd == null || ( pwd = pwd.trim() ).length() == 0 )

        {
            res = ResponseEntity.badRequest()
                    .body( "les champs nom/prénom/mail/mot de passe sont obligatoires" );

        } else {
            this.libraireService.existe( email );

            res = ResponseEntity.badRequest()
                    .body( "Cette adresse mail existe déjà!" );

        }

        res = ResponseEntity.badRequest()
                .body( "Ce libraire a bien été ajouté" );

        return res;
    }

    @RequestMapping( value = "/libraires/{email}", method = RequestMethod.DELETE )
    public ResponseEntity<String> validationSuppression( @PathVariable( value = "email" ) String email ) {

        log.debug( "suppression : {} ", email );
        ResponseEntity<String> res;

        if ( !this.libraireService.existe( email ) ) {
            log.warn( "ce libraire n'existe pas !" );
            res = ResponseEntity.status( HttpStatus.NOT_FOUND ).body( "ce libraire n'existe pas !" );

        } else {
            this.libraireService.delete( email );
            res = ResponseEntity.ok( "suppression avec succés" );

            log.info( "suppression avec succés" );
        }

        return res;
    }

}
