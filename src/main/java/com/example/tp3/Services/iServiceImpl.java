package com.example.tp3.Services;

import com.example.tp3.DAO.iDAO;
import com.example.tp3.Domaine.ArticleConverter;
import com.example.tp3.Domaine.ArticleDTO;
import com.example.tp3.Services.Exceptions.BusinessException;
import com.example.tp3.Services.Model.Article;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class iServiceImpl implements iService{
    private iDAO dao;

    @Autowired
    public iServiceImpl(iDAO dao) {
        this.dao = dao;
    }

    @Override
    public ArticleDTO getById(Long id) {
        return ArticleConverter.toDTO(dao.findById(id));
    }

    @Override
    public List<ArticleDTO> getAll() {
        return ArticleConverter.toDTOs(dao.findAll());
    }

    @Override
    public void create(ArticleDTO articleDTO) {
        Article articleFound = dao.findAll().stream().filter(a -> articleDTO.getId().equals(a.getId())).findFirst().orElse(null);
        if(articleFound !=null)
            throw new BusinessException("Article with the same ID="+articleDTO.getId()+" exists already !");
        dao.save(ArticleConverter.toBO(articleDTO));
    }

    @Override
    public void update(Long id, ArticleDTO article) {
        article.setId(id);
        dao.save(ArticleConverter.toBO(article));
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
