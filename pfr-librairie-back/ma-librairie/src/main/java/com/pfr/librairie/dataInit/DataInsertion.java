// package com.pfr.librairie.dataInit;
//
// import javax.annotation.PostConstruct;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
//
// import com.pfr.librairie.entity.ClientEntity;
// import com.pfr.librairie.service.IServiceClient;
//
// import lombok.extern.slf4j.Slf4j;
//
// @Slf4j
// @Component
// public class DataInsertion {
//
// @Autowired
// IServiceClient serviceClient;
//
// @PostConstruct
// public void DataInsertion() {
//
// this.insertionClient();
//
// }
//
// private void insertionClient() {
//
// ClientEntity client = new ClientEntity( "toutou@gmail.com", "croquette",
// "croquette", "Mosby", "Ted",
// "0303030303" );
// serviceClient.create( client );
//
// ClientEntity client2 = new ClientEntity( "toto@gmail.com", "abc", "abc",
// "Eriksen", "Marshall",
// "0303030304" );
// serviceClient.create( client2 );
// System.out.println( "Client bien ajouté" );
// ClientEntity client3 = new ClientEntity( "tata@gmail.com", "def", "def",
// "Stinson", "Barney",
// "0303030305" );
// serviceClient.create( client3 );
// ClientEntity client4 = new ClientEntity( "titi@gmail.com", "ghi", "ghi",
// "Eriksen", "Lili",
// "0303030306" );
// serviceClient.create( client4 );
// }
//
// }
