package com.pfr.librairie.entity;

import java.time.LocalDateTime;

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
@Table( name = "t_commande" )
public class CommandeEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int           id;
    private LocalDateTime timeStamp;
    // private LivreEntity livre;
    private int           nombreLivre;

    public CommandeEntity( int nombreLivre ) {
        this.nombreLivre = nombreLivre;
    }

}
