package com.KayKayProjesi.Profil.security.services;

import com.KayKayProjesi.Profil.models.Hesap_Bilgileri;

import java.util.List;

public interface Hesap_bigileri_service {

    List<Hesap_Bilgileri>findALL();

    Hesap_Bilgileri findById(int theId);

    Hesap_Bilgileri save (Hesap_Bilgileri theHesapBilgileri);

    void deleteById(int theId);
}
