package com.example.ProjektPersistence.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="kategorie")
public class Kategoria {
    public Kategoria() {
    }

    public Kategoria(String nazwa) {
        this.nazwa = nazwa;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nazwa")
    private String nazwa;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "kategoria", cascade =
            {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.REMOVE})
    List<Ksiazka> ksiazki;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(List<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }

    public void addKsiazka(Ksiazka ksiazka) {
        if (ksiazki.isEmpty())
            ksiazki = new ArrayList<>();
        ksiazka.setKategoria(this);
        ksiazki.add(ksiazka);
    }
    @Override
    public String toString() {
        return getNazwa();
    }
}