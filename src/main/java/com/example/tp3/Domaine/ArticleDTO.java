package com.example.tp3.Domaine;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleDTO implements Serializable {
    private Long id;
    @Size(min = 1,max = 30,message = "Description size must be between 1 and 30")
    private String desc;
    private Double price;
    @Min(value = 1,message = "The quantity value must be greater than 1")
    private Double qte;
}
