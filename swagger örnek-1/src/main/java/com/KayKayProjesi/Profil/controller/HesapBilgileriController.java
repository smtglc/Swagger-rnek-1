package com.KayKayProjesi.Profil.controller;

import com.KayKayProjesi.Profil.models.Hesap_Bilgileri;
import com.KayKayProjesi.Profil.security.services.HesapBilgileriImpl;
import com.KayKayProjesi.Profil.security.services.Hesap_bigileri_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HesapBilgileriController {

    private Hesap_bigileri_service  hesapBigileriService;

    @Autowired
    public HesapBilgileriController (Hesap_bigileri_service theHesapBilgileriService)
    {
        hesapBigileriService=theHesapBilgileriService;
    }

    @GetMapping("/hesap_bilgileri")
    public List<Hesap_Bilgileri> findAll()
    {
        return hesapBigileriService.findALL();
    }

    @GetMapping("/Hesap/{hesapbilgiId}")
    public Hesap_Bilgileri getHesap_Bilgileri(@PathVariable int hesapId)
    {
        Hesap_Bilgileri theHesapBilgileri =hesapBigileriService.findById(hesapId);

        if (theHesapBilgileri==null)
        {
            throw new RuntimeException("Hesap Bulunamadı"+hesapId);
        }
        return theHesapBilgileri;
    }
    @PostMapping("/Hesap")
    public  Hesap_Bilgileri addHesapBilgi(@RequestBody Hesap_Bilgileri theHesap)
    {
        theHesap.setId(0 );

        Hesap_Bilgileri dbHesap=hesapBigileriService.save(theHesap);

        return dbHesap;
    }

    @PutMapping("/Hesap")
    public Hesap_Bilgileri updateHesapBilgi(@RequestBody Hesap_Bilgileri theHesap)
    {
        Hesap_Bilgileri dbHesap =hesapBigileriService.save(theHesap);

        return dbHesap;
    }

    @DeleteMapping("/Hesap")
    public String deleteHesapBilgisi(@PathVariable int hesapId)
    {
        Hesap_Bilgileri tempHesap=hesapBigileriService.findById(hesapId);

        if(tempHesap==null)
        {
            throw  new RuntimeException("Hesap Bulunamadı"+hesapId);

        }
        hesapBigileriService.deleteById(hesapId);

        return "Hesap silindi"+hesapId;
    }


}
