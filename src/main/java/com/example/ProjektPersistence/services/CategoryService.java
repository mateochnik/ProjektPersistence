package com.example.ProjektPersistence.services;

import com.example.ProjektPersistence.entity.Kategoria;

import java.util.List;

public interface CategoryService {
    List<Kategoria> getCategories();
    void saveCategory(Kategoria kategoria);
    Kategoria getCategory(int id);
    void deleteCategory(int id);
    void updateCategory(int id, Kategoria kategoria);
}
