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
    }
}
