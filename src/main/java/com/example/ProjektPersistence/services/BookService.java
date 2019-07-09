package com.example.ProjektPersistence.services;

import com.example.ProjektPersistence.entity.Ksiazka;

import java.util.List;

public interface BookService {
    List<Ksiazka> getBooks();
    void saveBook(Ksiazka ksiazka);
    Ksiazka getBook(int id);
    void deleteBook(int id);
    void updateBook(int id, Ksiazka ksiazka);
}