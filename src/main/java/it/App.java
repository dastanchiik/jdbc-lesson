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
        Measures measures = new Measures();
        measures.setName("Richarlson");
        measures.setAge(28);
        measures.setOwnCity("Sao Paulo");

        Measures measures1 = new Measures();
        measures1.setName("Beckham");
        measures1.setAge(49);
        measures1.setOwnCity("London");

        Measures measures2 = new Measures();
        measures2.setName("Hazard");
        measures2.setAge(36);
        measures2.setOwnCity("Antwerp");

        MeasureRepository repository = new MeasureRepository();
        repository.saveCountry(measures);
        repository.saveCountry(measures1);
        repository.saveCountry(measures2);

    }
}
