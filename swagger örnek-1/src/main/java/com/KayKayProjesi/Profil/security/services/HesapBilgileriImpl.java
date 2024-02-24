package com.KayKayProjesi.Profil.security.services;

import com.KayKayProjesi.Profil.models.Hesap_Bilgileri;
import com.KayKayProjesi.Profil.repository.Hesap_bilgileri_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HesapBilgileriImpl implements Hesap_bigileri_service{



    private Hesap_bilgileri_repository hesapBilgileriRepository;

    @Autowired
    public HesapBilgileriImpl(Hesap_bilgileri_repository theHesapBilgileriRepository)
    {
       hesapBilgileriRepository= theHesapBilgileriRepository;
    }


    @Override
    public List<Hesap_Bilgileri> findALL() {
        return hesapBilgileriRepository.findAll() ;
    }

    @Override
    public Hesap_Bilgileri findById(int theId) {
        Optional<Hesap_Bilgileri> result = hesapBilgileriRepository.findById(theId);
        Hesap_Bilgileri theHesapBilgileri = null;

        if (result.isPresent())


        {

            theHesapBilgileri=result.get();
        }
        else
        {
            throw new RuntimeException("Did Not Find Hesap Bilgileri id"+theId);
        }
        return theHesapBilgileri;
    }

    @Override
    public Hesap_Bilgileri save(Hesap_Bilgileri theHesapBilgileri) {
        return hesapBilgileriRepository.save(theHesapBilgileri);
    }

    @Override
    public void deleteById(int theId) {
   hesapBilgileriRepository.deleteById(theId);
    }
}
