package com.example.ProjektPersistence.dao;

import com.example.ProjektPersistence.entity.Autor;
import com.example.ProjektPersistence.entity.Ksiazka;

import java.util.List;

public interface BookDAO {
    public List<Ksiazka> getBooks();
    public void saveBook(Ksiazka ksiazka);
    public Ksiazka getBook(int id);
    public void deleteBook(int id);
    public void editBook(int id, Ksiazka ksiazka);
    List<Autor> findAuthorsByBookId(int bookId);

}