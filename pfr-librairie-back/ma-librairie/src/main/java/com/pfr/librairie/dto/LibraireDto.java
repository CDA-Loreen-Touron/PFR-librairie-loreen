package com.pfr.librairie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LibraireDto {

    private String email;
    private String pwd;
    private String nom;
    private String prenom;

}
