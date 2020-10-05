package com.pfr.librairie.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pfr.librairie.entity.CommandeEntity;

@Repository
public interface IDaoCommande extends PagingAndSortingRepository<CommandeEntity, Integer> {

    List<CommandeEntity> findAll();

    Optional<CommandeEntity> findById( int pId );

}
