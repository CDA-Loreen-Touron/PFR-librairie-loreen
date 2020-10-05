package com.pfr.librairie.dataInit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pfr.librairie.dao.IDaoClient;
import com.pfr.librairie.dto.ClientDto;
import com.pfr.librairie.service.IServiceClient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DataInsertion {

    @Autowired
    IDaoClient     clientDao;

    @Autowired
    IServiceClient serviceClient;

    @PostConstruct
    public void DataInsertion() {

        this.insertionClient();

    }

    private void insertionClient() {

        ClientDto client = new ClientDto( "toutou@gmail.com", "croquette", "croquette", "Mosby", "Ted", "0303030303" );
        serviceClient.create( client );
        System.out.println( "Client bien ajouté" );
        ClientDto client2 = new ClientDto( "toto@gmail.com", "abc", "abc", "Eriksen", "Marshall",
                "0303030304" );
        serviceClient.create( client2 );
        System.out.println( "Client bien ajouté" );
        ClientDto client3 = new ClientDto( "tata@gmail.com", "def", "def", "Stinson", "Barney",
                "0303030305" );
        serviceClient.create( client3 );
        ClientDto client4 = new ClientDto( "titi@gmail.com", "ghi", "ghi", "Eriksen", "Lili",
                "0303030306" );
        serviceClient.create( client4 );
    }

}
