package com.example.ProjektPersistence.dao;

import com.example.ProjektPersistence.entity.Kategoria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Kategoria> getCategories() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query query = currentSession.createQuery(" from Kategoria", Kategoria.class);
        List<Kategoria> categories = query.getResultList();
        return categories;
    }

    @Override
    public void saveCategory(Kategoria kategoria) {
        Session session = sessionFactory.getCurrentSession();
        session.save(kategoria);
    }

    @Override
    public Kategoria getCategory(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery(" from Kategoria where id = :categoryId", Kategoria.class).setParameter("categoryId", id);
        Kategoria kategoria = (Kategoria) query.getSingleResult();
        return kategoria;
    }

    @Override
    public void deleteCategory(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery(" from Kategoria where id = :categoryId", Kategoria.class).setParameter("categoryId", id);
        Kategoria kategoria = (Kategoria) query.getSingleResult();
        currentSession.delete(kategoria);

    }

    @Override
    public void updateCategory(int id, Kategoria kategoria) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery(" from Kategoria where id = :categoryId", Kategoria.class).setParameter("categoryId", id);
        Kategoria category = (Kategoria) query.getSingleResult();
        category.setNazwa(kategoria.getNazwa());
        currentSession.update(kategoria);
    }
}
