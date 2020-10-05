package com.pfr.librairie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table( name = "t_adresse" )
public class AdresseEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int    id;
    private int    numero;
    private String rue;
    private int    cp;
    private String ville;
    private String complement;

    public AdresseEntity( int pNumero, String pRue, int pCp, String pVille, String pComplement ) {
        this.numero = pNumero;
        this.rue = pRue;
        this.cp = pCp;
        this.ville = pVille;
        this.complement = pComplement;

    }

}
