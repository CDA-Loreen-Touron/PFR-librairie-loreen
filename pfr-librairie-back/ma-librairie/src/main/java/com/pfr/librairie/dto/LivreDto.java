package com.pfr.librairie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivreDto {

    private int     id;
    private String  titre;
    private String  auteur;
    private String  format;
    private boolean enStock;

}
