package com.example.normaprojectcustomermanagement;

import com.example.normaprojectcustomermanagement.model.City;
import com.example.normaprojectcustomermanagement.model.Country;
import com.example.normaprojectcustomermanagement.model.Currency;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class Initializer {
//    @PostConstruct

    @PersistenceContext
    private EntityManager entityManager;


    private List<City> populateCities(Optional<Country> optinalCountry){
        Country turkey =optinalCountry.get();
        City ankara=new City();
        ankara.setCountry(turkey);
        ankara.setName("Ankara");

        return Arrays.asList(ankara);
    }

    private List<Currency> populateCurrency(){
        Currency turkishLira=new Currency();
        turkishLira.setCode("TR");
        turkishLira.setSymbol("₺");
        turkishLira.setName("Turkish Lira");

        Currency usd=new Currency();
        usd.setCode("TR");
        usd.setSymbol("₺");
        usd.setName("Turkish Lira");
        return Arrays.asList(turkishLira,usd);
    }
    


}
