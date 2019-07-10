package com.example.ProjektPersistence.dao;

import com.example.ProjektPersistence.entity.Autor;
import com.example.ProjektPersistence.entity.Ksiazka;

import java.util.List;

public interface AuthorDAO {
    List<Autor> getAuthors();
    void saveAuthor(Autor autor);
    Autor getAuthor(int id);
    void deleteAuthor(int id);
    void editAuthor(int id, Autor autor);
    List<Ksiazka> findBooksByAuthorId(int authorId);
}
