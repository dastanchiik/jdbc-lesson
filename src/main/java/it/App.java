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
        MeasureRepository measureRepository = new MeasureRepository();
        Measures measures = new Measures();
        measures.setName("Adilet");
        measures.setAge(13);
        measures.setOwnCity("Bishkek");
        System.out.println(measureRepository.saveCountry(measures));
    }
}
