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

import com.pfr.librairie.entity.AdresseEntity;
import com.pfr.librairie.entity.ClientEntity;
import com.pfr.librairie.service.IServiceAdresse;
import com.pfr.librairie.tools.Constantes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class AdresseController {

    @Autowired
    IServiceAdresse adresseService;

    @RequestMapping( value = { "/formulaireAdresse" }, method = { RequestMethod.POST, RequestMethod.GET } )
    protected ModelAndView listerAdresse( @RequestParam( value = "page", defaultValue = "1" ) int pageEnCours ) {
        log.debug( "list adresse" );

        ModelAndView model = new ModelAndView();// va faire le lien avec la jsp

        List<AdresseEntity> vAdresse = this.adresseService.getAll( pageEnCours );

        model.addObject( "adresse", vAdresse );// "commandes" on va se
                                               // servir de
        // ce nom dans la jsp
        model.addObject( "nbElementsParPage", Constantes.ELEMENTS_PAR_PAGE );
        model.addObject( "count", this.adresseService.count() );
        model.addObject( "pageEnCours", pageEnCours );

        model.setViewName( "formulaireAdresse" );//
        return model;
    }

    @RequestMapping( value = "/adresse", method = RequestMethod.POST )
    public ResponseEntity<String> validationAjout(
            @RequestParam( value = "id" ) int id,
            @RequestParam( value = "numero" ) int numero,
            @RequestParam( value = "rue" ) String rue,
            @RequestParam( value = "cp" ) int cp,
            @RequestParam( value = "ville" ) String ville,
            @RequestParam( value = "complement" ) String complement,
            @RequestParam( value = "client" ) ClientEntity client ) {

        log.trace( "id: " + id );
        log.debug( "AdresseController ajout de ville: {} et client: {}", ville, client );

        ResponseEntity<String> res;

        if ( numero == 0 ||
                rue == null || ( rue = rue.trim() ).length() == 0
                || cp == 0
                || ville == null || ( ville = ville.trim() ).length() == 0 )

        {
            res = ResponseEntity.badRequest()
                    .body( "les champs numéro/rue/cp/ville sont obligatoires" );

        } else {
            this.adresseService.existe( id );

            res = ResponseEntity.badRequest()
                    .body( "Cette adresse existe déjà!" );

        }

        return res;
    }

    @RequestMapping( value = "/adresse/{id}", method = RequestMethod.DELETE )
    public ResponseEntity<String> validationSuppression( @PathVariable( value = "id" ) int id ) {

        log.debug( "suppression : {} ", id );
        ResponseEntity<String> res;

        if ( !this.adresseService.existe( id ) ) {
            log.warn( "Cette adresse n'existe pas !" );
            res = ResponseEntity.status( HttpStatus.NOT_FOUND ).body( "Cette adresse n'existe pas !" );

        } else {
            this.adresseService.delete( id );
            res = ResponseEntity.ok( "suppression de l'adresse avec succés" );

            log.info( "suppression avec succés" );
        }

        return res;
    }

}
