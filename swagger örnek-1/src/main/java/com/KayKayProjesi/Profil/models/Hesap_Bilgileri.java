package com.KayKayProjesi.Profil.models;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Hesap_Bilgileri")
public class Hesap_Bilgileri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "telfon_num")
    private String telefon_num;

    @Column(name = "adress")
    private String adress;

    @OneToOne
    @JoinColumn(name = "id")
    @MapsId
    private User user ;

    public Hesap_Bilgileri(String name, String telefon_num, String adress, User user) {
        this.name = name;
        this.telefon_num = telefon_num;
        this.adress = adress;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefon_num() {
        return telefon_num;
    }

    public void setTelefon_num(String telefon_num) {
        this.telefon_num = telefon_num;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Hesap_Bilgileri{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telefon_num='" + telefon_num + '\'' +
                ", adress='" + adress + '\'' +
                ", user=" + user +
                '}';
    }
}
