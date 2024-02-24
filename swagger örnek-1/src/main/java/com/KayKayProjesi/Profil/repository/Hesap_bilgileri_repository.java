package com.KayKayProjesi.Profil.repository;

import com.KayKayProjesi.Profil.models.Hesap_Bilgileri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Hesap_bilgileri_repository extends JpaRepository<Hesap_Bilgileri,Integer> {
}
