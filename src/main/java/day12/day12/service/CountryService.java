package day12.day12.service;

import java.util.List;

import day12.day12.model.*;
import day12.day12.repo.CountryRepo;

public class CountryService {

    CountryRepo ctyRepo;

    //No auto-wiring example
    public CountryService() {

        ctyRepo = new CountryRepo();
    }

    public List<Country> getAllCountries() {
        return ctyRepo.getAllCountries();
    }

    public Boolean createCountry(Country cty) {
        Boolean result = ctyRepo.createCountry(cty);
        return result;
    }
    
}
