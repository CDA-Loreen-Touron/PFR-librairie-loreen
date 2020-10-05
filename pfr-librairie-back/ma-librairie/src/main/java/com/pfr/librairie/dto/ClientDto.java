package com.pfr.librairie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {

    private String email;
    private String pwd;
    private String confirmation;
    private String nom;
    private String prenom;
    // private AdresseDto adresse;
    private String telephone;
    // private boolean abonement;

}
