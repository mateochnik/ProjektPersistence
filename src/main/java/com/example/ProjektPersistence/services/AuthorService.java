package com.example.ProjektPersistence.services;

import com.example.ProjektPersistence.entity.Autor;

import java.util.List;

public interface AuthorService {
    List<Autor> getAuthors();
    void saveAuthor(Autor autor);
    Autor getAuthor(int id);
    void deleteAuthor(int id);
    void updateAuthor(int id, Autor autor);
}
