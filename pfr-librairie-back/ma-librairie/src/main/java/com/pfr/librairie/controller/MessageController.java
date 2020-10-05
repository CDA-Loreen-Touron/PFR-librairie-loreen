package com.pfr.librairie.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pfr.librairie.entity.MessageEntity;
import com.pfr.librairie.service.IServiceMessage;
import com.pfr.librairie.tools.Constantes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RestController
@CrossOrigin( origins = "http://localhost:4200" )
public class MessageController {

    @Autowired
    IServiceMessage messageService;

    @RequestMapping( value = { "/formulaireMessage" }, method = { RequestMethod.POST, RequestMethod.GET } )
    protected ModelAndView listerMessage( @RequestParam( value = "page", defaultValue = "1" ) int pageEnCours ) {
        log.debug( "list message" );

        ModelAndView model = new ModelAndView();// va faire le lien avec la jsp

        List<MessageEntity> vMessage = this.messageService.getAll( pageEnCours );

        model.addObject( "message", vMessage );// "clients" on va se servir de
                                               // ce nom dans la jsp
        model.addObject( "nbElementsParPage", Constantes.ELEMENTS_PAR_PAGE );
        model.addObject( "count", this.messageService.count() );
        model.addObject( "pageEnCours", pageEnCours );

        model.setViewName( "formulaireMessage" );//
        return model;
    }

    @RequestMapping( value = "/message", method = RequestMethod.POST )
    public ResponseEntity<String> validationAjout(
            @RequestParam( value = "id" ) int id,
            @RequestParam( value = "auteur" ) String auteur,
            @RequestParam( value = "timeStamp" ) LocalDateTime timeStamp,
            @RequestParam( value = "message" ) String message ) {

        log.trace( "id : " + id );
        log.debug( "MessageController ajout de auteur: {} et message: {}", auteur, message );

        ResponseEntity<String> res;

        if ( auteur == null || ( auteur = auteur.trim() ).length() == 0
                || message == null || ( message = message.trim() ).length() == 0 )

        {
            res = ResponseEntity.badRequest()
                    .body( "Les champs auteur et message doivent être remplis pour envoyer le message" );

        }
        res = ResponseEntity.ok( "Le message peut être envoyé" );
        return res;
    }
}

// @Autowired
// private IDaoMessage messageDao;
//
// // si envoie requete de type get alors on utilise methode ci
// // dessous
// @GetMapping( "/MessagePage" )
// public String showMessage( Model model ) {
// // ModelAndView nm = new ModelAndView();
//
// // model.addAttribute( "messageList", messageDao.findAll() );// va
// // chercher
// // // dans la bdd
// // // tous les
// // // messages
// // model.addAttribute( "newMessage", new Message() );
// return "MessagePage";
// }
//
// @PostMapping( "/MessagePage" )
// public String getMessage( @ModelAttribute MessageEntity newMessage ) {
//
// MessageEntity msg = new MessageEntity( newMessage.getAuteur(),
// newMessage.getMessage() );
//
// messageDao.save( msg );
//
// return "redirect:msg";
// }
//
// }
