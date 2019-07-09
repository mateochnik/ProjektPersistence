package com.example.ProjektPersistence.services;

import com.example.ProjektPersistence.dao.CategoryDAO;
import com.example.ProjektPersistence.entity.Kategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    @Transactional
    public List<Kategoria> getCategories() {
        return categoryDAO.getCategories();
    }

    @Override
    @Transactional
    public void saveCategory(Kategoria kategoria) {
        categoryDAO.saveCategory(kategoria);

    }

    @Override
    @Transactional
    public Kategoria getCategory(int id) {
        return categoryDAO.getCategory(id);
    }

    @Override
    @Transactional
    public void deleteCategory(int id) {
        categoryDAO.deleteCategory(id);
    }

    @Override
    @Transactional
    public void updateCategory(int id, Kategoria kategoria) {
        categoryDAO.updateCategory(id , kategoria);

    }

}
