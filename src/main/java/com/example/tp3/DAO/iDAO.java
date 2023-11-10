package com.example.tp3.DAO;

import com.example.tp3.Services.Model.Article;

import java.util.List;

public interface iDAO {
    Article findById(Long id);
    List<Article> findAll();
    void save(Article article);
    void deleteById(Long id);
}
