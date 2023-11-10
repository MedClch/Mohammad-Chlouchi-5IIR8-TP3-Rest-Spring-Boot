package com.example.tp3.Services.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article implements Serializable {
    private Long id;
    private String desc;
    private Double price;
    private Double qte;
}
