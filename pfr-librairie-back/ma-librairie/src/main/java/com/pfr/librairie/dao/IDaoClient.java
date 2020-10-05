package com.pfr.librairie.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pfr.librairie.entity.ClientEntity;
import com.pfr.librairie.entity.ClientEntity.ClientEntityBuilder;

@Repository
public interface IDaoClient extends PagingAndSortingRepository<ClientEntity, String> {
    @Autowired
    List<ClientEntity> findAll();

    Optional<ClientEntity> findByEmail( String email );

    Optional<ClientEntity> deleteByEmail( String email );

    void save( ClientEntityBuilder email );

}
