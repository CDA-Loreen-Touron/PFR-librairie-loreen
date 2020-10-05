package com.pfr.librairie.dto;

import com.pfr.librairie.entity.ClientEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdresseDto {
    private int          id;
    private int          numero;
    private String       rue;
    private int          cp;
    private String       ville;
    private String       complement;
    private ClientEntity client;

}
