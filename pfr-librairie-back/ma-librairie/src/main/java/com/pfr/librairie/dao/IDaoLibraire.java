package com.pfr.librairie.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pfr.librairie.entity.LibraireEntity;

@Repository
public interface IDaoLibraire extends PagingAndSortingRepository<LibraireEntity, String> {

    List<LibraireEntity> findAll();

    Optional<LibraireEntity> findByEmail( String pEmail );

    Optional<LibraireEntity> deleteByEmail( String pEmail );

}
