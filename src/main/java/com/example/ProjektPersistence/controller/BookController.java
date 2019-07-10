package com.example.ProjektPersistence.controller;

import com.example.ProjektPersistence.entity.Autor;
import com.example.ProjektPersistence.entity.Kategoria;
import com.example.ProjektPersistence.entity.Ksiazka;
import com.example.ProjektPersistence.services.AuthorService;
import com.example.ProjektPersistence.services.BookService;
import com.example.ProjektPersistence.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private AuthorService authorService;
    //@RequestMapping("/list")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @RequestMapping("/list")
    public String listBook(Model model)
    {
        List<Ksiazka> books = bookService.getBooks();
        model.addAttribute("books",books);
        return "bookslist";
    }
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER')")
    @RequestMapping("list/{id}")
    public String getBook(@PathVariable int id, Model model){
        Ksiazka book = bookService.getBook(id);
        List<Autor> autors = bookService.getAuthorsByBookId(id);
        model.addAttribute("book", book);
        model.addAttribute("authors", autors);
        return "book";
    }
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/formadd")
    public String addForm(Model model)
    {
        Ksiazka book = new Ksiazka();
        List<Kategoria> kategorias = categoryService.getCategories();
        List<Autor> autorzy = authorService.getAuthors();

        model.addAttribute("book",book);
        model.addAttribute("category", kategorias);
        model.addAttribute("authors", autorzy);
        return "addbookform";
    }


    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Ksiazka ksiazka)
    {
        bookService.saveBook(ksiazka);
        return "redirect:/books/list";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/list/{id}/delete")
    public String deleteBook(@PathVariable int id, Model model){
        bookService.deleteBook(id);
        return "redirect:/books/list";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/list/{id}/edit")
    public String updateBook(@PathVariable int id, Model model){
        Ksiazka book = bookService.getBook(id);
        List<Kategoria> kategorias = categoryService.getCategories();
        model.addAttribute("book",book);
        model.addAttribute("category", kategorias);
        return "editbookform";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("list/{id}/editBook")
    public String editBook(@PathVariable int id, @ModelAttribute("book") Ksiazka ksiazka){
        bookService.updateBook(id, ksiazka);
        return "redirect:/books/list";
    }


}
