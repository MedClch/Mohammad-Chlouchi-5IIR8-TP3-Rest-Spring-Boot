package com.example.tp3.Domaine;

import com.example.tp3.Services.Model.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleConverter {
    public static Article toBO(ArticleDTO dto){
        if(dto==null)
            return null;
        return new Article(dto.getId(),dto.getDesc(), dto.getPrice(), dto.getQte());
    }

    public static ArticleDTO toDTO(Article article){
        if(article==null)
            return null;
        return new ArticleDTO(article.getId(),article.getDesc(),article.getPrice(),article.getQte());
    }

    public static List<Article> toBOs(List<ArticleDTO> dtoList){
        List<Article> boList = new ArrayList<>();
        dtoList.forEach(a -> boList.add(toBO(a)));
        return boList;
    }

    public static List<ArticleDTO> toDTOs(List<Article> boList){
        List<ArticleDTO> dtoList = new ArrayList<>();
        boList.forEach(a -> dtoList.add(toDTO(a)));
        return dtoList;
    }
}
