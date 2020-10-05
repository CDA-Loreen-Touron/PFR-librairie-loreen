package com.pfr.librairie.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto {

    private int           id;
    private String        auteur;
    private LocalDateTime timeStamp;
    private String        message;

}
