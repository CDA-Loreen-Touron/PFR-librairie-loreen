package com.pfr.librairie.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pfr.librairie.entity.MessageEntity;

@Repository
public interface IDaoMessage extends PagingAndSortingRepository<MessageEntity, Integer> {// dans
    // lextension
    // on va
    // mettre la
    // classe
    // message,
    // et l'id
    // est de
    // type integer

    List<MessageEntity> findAll();

    Optional<MessageEntity> findById( int pId );

    Optional<MessageEntity> deleteById( int pId );

}
