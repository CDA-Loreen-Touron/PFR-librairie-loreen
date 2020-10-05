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
@Table( name = "t_livre" )
public class LivreEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int    id;
    private String titre;
    private String auteur;
    private String format;
    // private boolean enStock;

    public LivreEntity( String titre, String auteur, String format ) {
        this.titre = titre;
        this.auteur = auteur;
        this.format = format;
    }

}
