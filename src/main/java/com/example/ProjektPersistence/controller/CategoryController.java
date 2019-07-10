package com.example.ProjektPersistence.controller;

import com.example.ProjektPersistence.entity.Kategoria;
import com.example.ProjektPersistence.entity.Ksiazka;
import com.example.ProjektPersistence.services.BookService;
import com.example.ProjektPersistence.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BookService bookService;
    //@RequestMapping("/list")

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @RequestMapping("/list")
    public String listBook(Model model)
    {
        List<Kategoria> categories = categoryService.getCategories();
        model.addAttribute("categories",categories);
        return "categorieslist";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @RequestMapping("list/{id}")
    public String getCategory(@PathVariable int id, Model model){
        Kategoria kategoria = categoryService.getCategory(id);
        List<Ksiazka> ksiazki = bookService.getBooks();
        List<Ksiazka> ksiazkiKategoria = new LinkedList<>();
        for(int i =0; i < ksiazki.size(); i++){
            if(ksiazki.get(i).getKategoria().getId() == kategoria.getId()){
                ksiazkiKategoria.add(ksiazki.get(i));
            }
        }
        model.addAttribute("category", kategoria);
        model.addAttribute("books", ksiazkiKategoria);
        return "category";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/formadd")
    public String addForm(Model model)
    {
        Kategoria category = new Kategoria();
        model.addAttribute("category",category);
        return "addcategoryform";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/saveCategory")
    public String saveCategory(@ModelAttribute("category") Kategoria category) {
        categoryService.saveCategory(category);
        return "redirect:/categories/list";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/list/{id}/delete")
    public String deleteCategory(@PathVariable int id, Model model){
        categoryService.deleteCategory(id);
        return "redirect:/categories/list";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/list/{id}/edit")
    public String updateCategory(@PathVariable int id, Model model){
        Kategoria kategoria = categoryService.getCategory(id);
        model.addAttribute("category",kategoria);
        return "editcategoryform";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("list/{id}/editCategory")
    public String editCategory(@PathVariable int id, @ModelAttribute("category") Kategoria kategoria){
        categoryService.updateCategory(id, kategoria);
        return "redirect:/categories/list";
    }



}
