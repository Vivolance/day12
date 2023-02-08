package day12.day12.repo;

import java.util.*;
import day12.day12.model.Country;

//No auto wiring example
public class CountryRepo {

    List<Country> countryList;

    public List<Country> getAllCountries() {

        countryList = new ArrayList<Country>();
        Country cty = new Country("MY", "Malaysia", 330000000);
        countryList.add(cty);
        cty = new Country("SG", "Singapore", 6000000);
        countryList.add(cty);
        cty = new Country("CN", "China", 226000000);
        countryList.add(cty);

        return countryList;

    }

    public Boolean createCountry(Country cty) {

        if (countryList == null) {
            countryList = new ArrayList<Country>();
        }

        countryList.add(cty);
        return true;
    }
    
}
