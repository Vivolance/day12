package day12.day12.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import day12.day12.model.Country;
import day12.day12.service.CountryService;

//Have to annotate for controller
@Controller
@RequestMapping(path={"/countries"})
public class CountryController {

    CountryService ctySvc;

    public CountryController() {
        ctySvc = new CountryService();

    }
    //data is in a response body
    @GetMapping
    public @ResponseBody List<Country> getAllCountries() {
        return ctySvc.getAllCountries();

    }

    @PostMapping()
    public @ResponseBody Boolean createCountry(@RequestBody Country cty) {
        return ctySvc.createCountry(cty);

        
    }

    @RequestMapping(path="/list", method=RequestMethod.GET)
    public String displayCountryList(Model model) {
        List<Country> ctyList = ctySvc.getAllCountries();
        model.addAttribute("countryList", ctyList);
        return "countryList";

    }
    
}
