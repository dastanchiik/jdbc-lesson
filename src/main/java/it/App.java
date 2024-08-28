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
//        City city = new City();
//        city.setTitle("Roma");
//
//        City city1 = new City();
//        city1.setTitle("Madrid");
//
//        City city2 = new City();
//        city2.setTitle("Tokyo");
//
        CityRepository repository = new CityRepository();
        repository.createTable();
//        repository.saveCity(city);
//        repository.saveCity(city1);
//        repository.saveCity(city2);

    }
}
