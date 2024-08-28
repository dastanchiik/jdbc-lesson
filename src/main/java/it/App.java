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
        CityRepository repository = new CityRepository();
        System.out.println(repository.getAllCity());

    }
}
