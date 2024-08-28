package it;

import dao.CityRepository;
import dao.CountryRepository;
import dao.MeasureRepository;
import model.City;
import model.Country;
import model.Measures;

import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        CountryRepository repository = new CountryRepository();
        Country country = new Country();
        country.setTitle("Brazil");
        country.setPopulation(898765434);
        repository.saveCountry(country);
        Country country1 = new Country();
        country1.setTitle("Sweden");
        country1.setPopulation(844752494);
        repository.saveCountry(country1);

        Country country2 = new Country();
        country2.setTitle("Kanada");
        country2.setPopulation(993715434);
        repository.saveCountry(country2);
//        System.out.println(repository.getAllCity());

    }
}
