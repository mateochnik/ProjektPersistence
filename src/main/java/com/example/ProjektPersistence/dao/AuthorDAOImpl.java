package com.example.ProjektPersistence.dao;

import com.example.ProjektPersistence.entity.Autor;
import com.example.ProjektPersistence.entity.Ksiazka;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository
public class AuthorDAOImpl implements AuthorDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Autor> getAuthors() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query query = currentSession.createQuery(" from Autor", Autor.class);
        List<Autor> authors = query.getResultList();
        return authors;
    }

    @Override
    public void saveAuthor(Autor autor) {
        Session session = sessionFactory.getCurrentSession();
        session.save(autor);

    }

    @Override
    public Autor getAuthor(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(" from Autor where id = :authorId", Autor.class).setParameter("authorId", id);
        Autor autor = (Autor) query.getSingleResult();
        return autor;
    }

    @Override
    public void deleteAuthor(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(" from Autor where id = :authorId", Autor.class).setParameter("authorId", id);
        Autor autor = (Autor) query.getSingleResult();
        session.delete(autor);

    }

    @Override
    public void editAuthor(int id, Autor autor) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(" from Autor where id = :authorId", Autor.class).setParameter("authorId", id);
        Autor author = (Autor) query.getSingleResult();
        author.setImie(autor.getImie());
        author.setNazwisko(autor.getNazwisko());

    }

    @Override
    public List<Ksiazka> findBooksByAuthorId(int authorId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(" from Autor where id = :authorId", Autor.class).setParameter("authorId", authorId);
        Autor autor = (Autor) query.getSingleResult();
        Set<Ksiazka> books = autor.getKsiazki();
        List<Ksiazka> ksiazki = new ArrayList<>(books);
        return ksiazki;
    }
}
