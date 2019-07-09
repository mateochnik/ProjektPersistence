package com.example.ProjektPersistence.dao;

import com.example.ProjektPersistence.entity.Ksiazka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import org.hibernate.query.Query;

import javax.swing.*;
import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {
    //automatyczne wykorzystanie beana sessionFactory
    @Autowired
    private SessionFactory sessionFactory;
    @Override
//pobranie i zwrocenie wszystkich ksiazek z bazy za pomoca zapytania HQL:
    public List<Ksiazka> getBooks() {
        //sesja hibertabe
        Session currentSession = sessionFactory.getCurrentSession();
        //zapytanie
        Query query = currentSession.createQuery(" from Ksiazka", Ksiazka.class);
        List<Ksiazka> books = query.getResultList();
        return books ;
    }
    @Override
//zapis ksiazki do bazy:
    public void saveBook(Ksiazka ksiazka) {
        Session session = sessionFactory.getCurrentSession();
        session.save(ksiazka);
    }

    @Override
    public Ksiazka getBook(int id){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(" from Ksiazka where id = :bookId", Ksiazka.class).setParameter("bookId", id);
        Ksiazka ksiazka = (Ksiazka) query.getSingleResult();
        return ksiazka;

    }

    @Override
    public void deleteBook(int id){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(" from Ksiazka where id = :bookId", Ksiazka.class).setParameter("bookId", id);
        Ksiazka ksiazka = (Ksiazka) query.getSingleResult();
        session.delete(ksiazka);
    }
    @Override
    public void editBook(int id, Ksiazka ksiazka){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(" from Ksiazka where id = :bookId", Ksiazka.class).setParameter("bookId", id);
        Ksiazka book = (Ksiazka) query.getSingleResult();
        if(ksiazka.getNazwa() != null){
            book.setNazwa(ksiazka.getNazwa());
        }
        if(ksiazka.getCena() != 0){
            book.setCena(ksiazka.getCena());
        }
        if(ksiazka.getWydawnictwo() != null){
            book.setWydawnictwo(ksiazka.getWydawnictwo());
        }
        session.update(book);

    }
}
