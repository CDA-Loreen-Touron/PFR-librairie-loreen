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
@Table( name = "t_client" )
public class ClientEntity {

    @Id
    private String email;
    private String pwd;
    private String confirmation;
    private String nom;
    private String prenom;
    private String telephone;
    // private boolean abonnement;

    // // @ManyToOne
    // private AdresseEntity adresse;

    // public ClientEntity( String nom, String prenom, String telephone ) {
    //
    // this.nom = nom;
    // this.prenom = prenom;
    // this.telephone = telephone;
    // this.abonnement = abonnement;
    // }

}
