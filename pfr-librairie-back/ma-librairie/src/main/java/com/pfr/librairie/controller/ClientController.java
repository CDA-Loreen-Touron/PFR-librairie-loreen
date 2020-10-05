
package com.pfr.librairie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pfr.librairie.entity.ClientEntity;
import com.pfr.librairie.service.IServiceClient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ClientController {

    @Autowired
    IServiceClient clientService;

    @RequestMapping( value = { "/", "/accueil" }, method = RequestMethod.GET )
    public String accueil( Model model ) {

        return "accueil";
    }

    @GetMapping( value = "/formulaireClient" )
    public String formulaireClient() {
        return "formulaireClient";
    }

    @PostMapping( value = "/formulaireClient" )
    public ModelAndView formulaireClient(

            @RequestParam( value = "prenom" ) String prenom,
            @RequestParam( value = "nom" ) String nom,
            @RequestParam( value = "email" ) String email,
            @RequestParam( value = "pwd" ) String pwd,
            @RequestParam( value = "confirmation" ) String confirmation,
            @RequestParam( value = "telephone" ) String telephone ) {

        log.trace( "nom : " + nom );
        // log.debug( "ClientController ajout de nom: {} et prenom: {}", nom,
        // prenom );
        ResponseEntity<String> reponseClient;

        if ( nom == null || ( nom = nom.trim() ).length() == 0
                || prenom == null || ( prenom = prenom.trim() ).length() == 0
                || email == null || ( email = email.trim() ).length() == 0
                || pwd == null || ( pwd = pwd.trim() ).length() == 0
                || confirmation == null || ( confirmation = confirmation.trim() ).length() == 0
                || telephone == null || ( telephone = telephone.trim() ).length() == 0

        )

        {

            reponseClient = ResponseEntity.badRequest()
                    .body( "Tous les champs sont obligatoires!" );

        }
        // else {
        //
        //
        // Pattern vPattern =
        // Pattern.compile("\b[A-Z0-9._%-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b");
        // for (String email) {
        //
        // if (vPattern.matcher(email).find()) {
        // reponseClient = ResponseEntity.ok()
        // .body( email+""+"est validée" );
        // }else{
        // reponseClient = ResponseEntity.badRequest()
        // .body( email+""+"est invalide" );
        // }
        // }

        // } else {
        // this.clientService.existe( email );
        //
        // reponseClient = ResponseEntity.badRequest()
        // .body( "Cette adresse mail existe déjà!" );
        // }

        // else {
        // if(pwd!=confirmation){
        // reponseClient = ResponseEntity.badRequest()
        // .body( "Le mot de passe et sa confirmation doivent être identiques"
        // );
        // }

        // AdresseEntity vAdresse = new AdresseEntity();

        ClientEntity c1 = new ClientEntity( nom, prenom, email, pwd,
                confirmation, telephone );
        clientService.save( c1 );
        ModelAndView mv = new ModelAndView();
        mv.setViewName( "afficherClient" );
        mv.addObject( "nom", nom );
        mv.addObject( "prenom", prenom );
        mv.addObject( "email", email );
        mv.addObject( "pwd", pwd );
        mv.addObject( "confirmation", confirmation );
        mv.addObject( "telephone", telephone );
        return mv;

    }

    @GetMapping( value = "/connexion" )
    public String connexion() {
        return "connexion";
    }

    @GetMapping( value = "/chercherLivre" )
    public String chercherLivre() {
        return "chercherLivre";
    }

    // @GetMapping( value = "/listeClient" )
    // public ModelAndView afficherTous() {
    // ArrayList<ClientEntity> clients = (ArrayList<ClientEntity>)
    // clientService.findAll();
    // ModelAndView mv = new ModelAndView();
    // mv.setViewName( "listeClients" );// nvelle page jsp à créer
    // mv.addObject( "clients", clients );
    // return mv;
    // }

}

// @Slf4j
// @Controller
//// @RequestMapping( "/formulaireClient" ) //page mère, si active à mettre en
//// premier sur navigateur
// public class ClientController {
//
// private static List<ClientEntity> clients = new ArrayList<ClientEntity>();
//
// @Autowired
// IServiceClient clientService;
//
// @RequestMapping( value = { "/", "/accueil" }, method = RequestMethod.GET )
// public String accueil( Model model ) {
// String message = "Hello Spring Boot + JSP";
// model.addAttribute( "message", message );
// return "accueil";
// }
//
// @RequestMapping( value = { "/formulaireClient" }, method = {
// RequestMethod.POST, RequestMethod.GET } )
// protected ModelAndView formulaireInscription(
// @RequestParam( value = "page", defaultValue = "1" ) int pageEnCours ) {
// log.debug( "list clients" );
//
// ModelAndView model = new ModelAndView();// va faire le lien avec la jsp
//
// List<ClientEntity> vClients = this.clientService.getAll( pageEnCours );
//
// model.addObject( "clients", vClients );// "clients" on va se servir de
// // ce nom dans la jsp
// model.addObject( "nbElementsParPage", Constantes.ELEMENTS_PAR_PAGE );
// model.addObject( "count", this.clientService.count() );
// model.addObject( "pageEnCours", pageEnCours );
//
// model.setViewName( "formulaireClient" );//
// return model;
// }
//
// @RequestMapping( value = { "/afficherClient" }, method = RequestMethod.POST )
// public String listeClients( Model model ) {
// model.addAttribute( "clients", clients );
// return "afficherClient";
// }
//
// @RequestMapping( value = { "/afficherClient", }, method = RequestMethod.POST
// )
// public String affichage( Model model ) {
// String message = "Vous êtes bien inscrit(e)";
// model.addAttribute( "message", message );
// return "afficherClient";
// }
// }

// @RequestMapping( value = { "/afficherClient" }, method = RequestMethod.POST )
// public ResponseEntity<String> validationAjout(
// @RequestParam( value = "prenom" ) String prenom,
// @RequestParam( value = "nom" ) String nom,
// @RequestParam( value = "email" ) String email,
// @RequestParam( value = "pwd" ) String pwd,
// @RequestParam( value = "confirmation" ) String confirmation,
// @RequestParam( value = "adresse" ) AdresseEntity adresse,
// @RequestParam( value = "telephone" ) String telephone )
//
// {
//
// log.trace( "email : " + email );
// log.debug( "ClientController ajout de nom: {} et prenom: {}", nom, prenom );
//
// try {
// confirmationPwd(pwd, confirmation);
//
// } catch (Exception e) {
//
// }
//
// private void confirmationPwd(String pwd, String confirmation) throws
// Exception{}
//
//
//
// ResponseEntity<String> reponseClient;
//
// if ( nom == null || ( nom = nom.trim() ).length() == 0
// || prenom == null || ( prenom = prenom.trim() ).length() == 0
// || email == null || ( email = email.trim() ).length() == 0
// || pwd == null || ( pwd = pwd.trim() ).length() == 0
// // || adresse == null || ( adresse = adresse.trim() ).length()
// // == 0
// || telephone == null || ( telephone = telephone.trim() ).length() == 0 )
//
// {
// reponseClient = ResponseEntity.badRequest()
// .body( "les champs nom/prénom/mail/mot de passe/adresse/téléphone sont
// obligatoires" );
//
// } else {
// this.clientService.existe( email );
//
// reponseClient = ResponseEntity.badRequest()
// .body( "Cette adresse mail existe déjà!" );
//
// }
//
// ClientEntity client = new ClientEntity();
// client.setEmail( email );
// client.setNom( nom );
// client.setPrenom( prenom );
// client.setPwd( pwd );
// client.setAdresse( adresse );
// client.setTelephone( telephone );
//
// reponseClient = ResponseEntity.badRequest()
// .body( "Votre compte a bien été créé" );
//
// return reponseClient;
//
// }
//
// @RequestMapping( value = "//{email}", method = RequestMethod.DELETE )
// public ResponseEntity<String> validationSuppression( @PathVariable( value =
// "email" ) String email ) {
//
// log.debug( "suppression : {} ", email );
// ResponseEntity<String> res;
//
// if ( !this.clientService.existe( email ) ) {
// log.warn( "ce client n'existe pas !" );
// res = ResponseEntity.status( HttpStatus.NOT_FOUND ).body( "ce client n'existe
// pas !" );
//
// } else {
// this.clientService.delete( email );
// res = ResponseEntity.ok( "suppression avec succés" );
//
// log.info( "suppression avec succés" );
// }
//
// return res;
// }
//
// }
