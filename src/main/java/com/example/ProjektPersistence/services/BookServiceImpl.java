package com.example.ProjektPersistence.services;

import com.example.ProjektPersistence.dao.BookDAO;
import com.example.ProjektPersistence.entity.Autor;
import com.example.ProjektPersistence.entity.Ksiazka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDAO bookDAO;

    @Override
    @Transactional
    public List<Ksiazka> getBooks() {
        List<Ksiazka> books = bookDAO.getBooks();
        return books;
    }
    @Override
    @Transactional
    public void saveBook(Ksiazka ksiazka) {
        bookDAO.saveBook(ksiazka);
    }

    @Override
    @Transactional
    public Ksiazka getBook(int id) {
        return bookDAO.getBook(id);
    }

    @Override
    @Transactional
    public void deleteBook(int id) {
        bookDAO.deleteBook(id);
    }

    @Override
    @Transactional
    public void updateBook(int id, Ksiazka ksiazka) {
        bookDAO.editBook(id, ksiazka);
    }

    @Transactional
    @Override
    public List<Autor> getAuthorsByBookId(int bookId) {
        return bookDAO.findAuthorsByBookId(bookId);

    }
}
