package com.example.ProjektPersistence.services;

import com.example.ProjektPersistence.entity.Autor;
import com.example.ProjektPersistence.entity.Ksiazka;

import java.util.List;

public interface AuthorService {
    List<Autor> getAuthors();
    void saveAuthor(Autor autor);
    Autor getAuthor(int id);
    void deleteAuthor(int id);
    void updateAuthor(int id, Autor autor);
    List<Ksiazka> findBooksByAuthorId(int authorId);
}
