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

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table( name = "t_message" )
public class MessageEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int           id;
    private String        auteur;
    private LocalDateTime timeStamp;
    private String        message;

    public MessageEntity( String auteur, String message ) {
        this.auteur = auteur;
        this.message = message;
    }

}
