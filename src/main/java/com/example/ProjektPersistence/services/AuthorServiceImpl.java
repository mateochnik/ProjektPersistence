package com.example.ProjektPersistence.services;

import com.example.ProjektPersistence.dao.AuthorDAO;
import com.example.ProjektPersistence.entity.Autor;
import com.example.ProjektPersistence.entity.Ksiazka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorDAO authorDAO;

    @Override
    @Transactional
    public List<Autor> getAuthors() {
        return authorDAO.getAuthors();
    }

    @Override
    @Transactional
    public void saveAuthor(Autor autor) {
        authorDAO.saveAuthor(autor);
    }

    @Override
    @Transactional
    public Autor getAuthor(int id) {
        return authorDAO.getAuthor(id);
    }

    @Override
    @Transactional
    public void deleteAuthor(int id) {
        authorDAO.deleteAuthor(id);
    }

    @Override
    @Transactional
    public void updateAuthor(int id, Autor autor) {
        authorDAO.editAuthor(id, autor);

    }

    @Override
    @Transactional
    public List<Ksiazka> findBooksByAuthorId(int authorId) {
        return authorDAO.findBooksByAuthorId(authorId);
    }
}
