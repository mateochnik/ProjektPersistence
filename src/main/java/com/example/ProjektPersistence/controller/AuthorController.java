package com.example.ProjektPersistence.controller;

import com.example.ProjektPersistence.entity.Autor;
import com.example.ProjektPersistence.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    //@RequestMapping("/list")

    @RequestMapping("/list")
    public String listAuthors(Model model)
    {
        List<Autor> authors = authorService.getAuthors();
        model.addAttribute("authors",authors);
        return "authorslist";
    }

    @RequestMapping("list/{id}")
    public String getAuthor(@PathVariable int id, Model model){
        Autor author = authorService.getAuthor(id);
        model.addAttribute("author", author);
        return "author";
    }


    @GetMapping("/formadd")
    public String addForm(Model model)
    {
        Autor author = new Autor();
        model.addAttribute("author",author);
        return "addauthorform";
    }

    @PostMapping("/saveAuthor")
    public String saveAuthor(@ModelAttribute("author") Autor author) {
        authorService.saveAuthor(author);
        return "redirect:/authors/list";
    }

    @GetMapping("/list/{id}/delete")
    public String deleteAuthor(@PathVariable int id, Model model){
        authorService.deleteAuthor(id);
        return "redirect:/authors/list";
    }

    @GetMapping("/list/{id}/edit")
    public String updateAuthor(@PathVariable int id, Model model){
        Autor autor = authorService.getAuthor(id);
        model.addAttribute("author",autor);
        return "editauthorform";
    }

    @PostMapping("list/{id}/editAuthor")
    public String editBook(@PathVariable int id, @ModelAttribute("author") Autor autor){
        authorService.updateAuthor(id, autor);
        return "redirect:/authors/list";
    }



}
