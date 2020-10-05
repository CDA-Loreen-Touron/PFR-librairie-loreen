package com.pfr.librairie.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table( name = "t_libraire" )
public class LibraireEntity {

    @Id
    private String email;
    private String pwd;
    private String nom;
    private String prenom;

    public LibraireEntity( String nom, String prenom ) {
        this.nom = nom;
        this.prenom = prenom;
    }

}
