package com.pfr.librairie.controller;

import java.time.LocalDateTime;
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

import com.pfr.librairie.entity.CommandeEntity;
import com.pfr.librairie.entity.LivreEntity;
import com.pfr.librairie.service.IServiceCommande;
import com.pfr.librairie.tools.Constantes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CommandeController {

    @Autowired
    IServiceCommande commandeService;

    @RequestMapping( value = { "/formulaireCommande" }, method = { RequestMethod.POST, RequestMethod.GET } )
    protected ModelAndView listerCommande( @RequestParam( value = "page", defaultValue = "1" ) int pageEnCours ) {
        log.debug( "list commande" );

        ModelAndView model = new ModelAndView();// va faire le lien avec la jsp

        List<CommandeEntity> vCommande = this.commandeService.getAll( pageEnCours );

        model.addObject( "commande", vCommande );// "commandes" on va se
                                                 // servir de
        // ce nom dans la jsp
        model.addObject( "nbElementsParPage", Constantes.ELEMENTS_PAR_PAGE );
        model.addObject( "count", this.commandeService.count() );
        model.addObject( "pageEnCours", pageEnCours );

        model.setViewName( "formulaireCommande" );//
        return model;
    }

    @RequestMapping( value = "/commande", method = RequestMethod.POST )
    public ResponseEntity<String> validationAjout(
            @RequestParam( value = "id" ) int id,
            @RequestParam( value = "date" ) LocalDateTime timeStamp,
            @RequestParam( value = "livre" ) LivreEntity livre,
            @RequestParam( value = "nombre" ) int nombreLivre ) {

        ResponseEntity<String> res;

        res = ResponseEntity.badRequest()
                .body( "La commande a été passée avec succès" );
        return res;
    }

    @RequestMapping( value = "/commande/{id}", method = RequestMethod.DELETE )
    public ResponseEntity<String> validationSuppression( @PathVariable( value = "id" ) int id ) {

        log.debug( "suppression : {} ", id );
        ResponseEntity<String> res;

        if ( !this.commandeService.existe( id ) ) {
            log.warn( "Cette commande n'existe pas !" );
            res = ResponseEntity.status( HttpStatus.NOT_FOUND ).body( "Cette commande n'existe pas !" );

        } else {
            this.commandeService.delete( id );
            res = ResponseEntity.ok( "suppression de la commande avec succés" );

            log.info( "suppression avec succés" );
        }

        return res;
    }

}