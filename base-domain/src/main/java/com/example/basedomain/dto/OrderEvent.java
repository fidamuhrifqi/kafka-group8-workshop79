package com.example.basedomain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private String message;
    private String status;
    private Order order;

    //FIDA KASEP BANGET EMANG
    //RAJIN MANDI LAGI
    //FEBI CANTIK
}
