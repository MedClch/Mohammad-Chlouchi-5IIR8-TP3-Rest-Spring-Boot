package com.example.tp3.Services;

import com.example.tp3.Domaine.ArticleDTO;

import java.util.List;

public interface iService {
    ArticleDTO getById(Long id);
    List<ArticleDTO> getAll();
    void create(ArticleDTO articleDTO);
    void update(Long id,ArticleDTO article);
    void deleteById(Long id);
}
