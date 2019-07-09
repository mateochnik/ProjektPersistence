package com.example.ProjektPersistence.dao;

import com.example.ProjektPersistence.entity.Kategoria;

import java.util.List;

public interface CategoryDAO {
    public List<Kategoria> getCategories();
    public void saveCategory(Kategoria kategoria);
    public Kategoria getCategory(int id);
    void deleteCategory(int id);
    void updateCategory(int id, Kategoria kategoria);
}
