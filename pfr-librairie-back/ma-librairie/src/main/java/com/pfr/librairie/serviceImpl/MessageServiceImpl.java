package com.pfr.librairie.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfr.librairie.dao.IDaoMessage;
import com.pfr.librairie.entity.MessageEntity;
import com.pfr.librairie.service.IServiceMessage;

@Service
public class MessageServiceImpl implements IServiceMessage {

    @Autowired
    private IDaoMessage messageDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public MessageEntity getMessageById( int pId ) {
        MessageEntity monMessage = new MessageEntity();

        return monMessage;
    }

    @Override
    public List<MessageEntity> getAll( int pageEnCours ) {
        List<MessageEntity> historique = new ArrayList<MessageEntity>();
        historique = messageDao.findAll();
        return historique;
    }

    @Override
    public Object count() {
        return this.messageDao.count();
    }

    @Override
    public MessageEntity addMessage( MessageEntity pMessage ) {
        MessageEntity message = new MessageEntity();

        message.setId( pMessage.getId() );
        message.setAuteur( pMessage.getAuteur() );
        message.setTimeStamp( pMessage.getTimeStamp() );
        message.setMessage( pMessage.getMessage() );

        return message;
    }

    @Override
    public void delete( int id ) {
        this.messageDao.deleteById( id );

    }

    @Override
    public MessageEntity getMessageByAuteur( String pAuteur ) {
        MessageEntity monMessage = new MessageEntity();

        return monMessage;
    }

}
