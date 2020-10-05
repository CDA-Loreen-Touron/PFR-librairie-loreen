package com.pfr.librairie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfr.librairie.entity.MessageEntity;

@Service
public interface IServiceMessage {

    MessageEntity getMessageById( int pId );

    List<MessageEntity> getAll( int pageEnCours );

    Object count();

    MessageEntity addMessage( MessageEntity pMessage );

    MessageEntity getMessageByAuteur( String pAuteur );

    void delete( int idToDelete );

}
