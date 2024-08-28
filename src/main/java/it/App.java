package it;

import dao.MeasureRepository;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        MeasureRepository repository = new MeasureRepository();
        System.out.println(repository.getAllMeasures());
    }
}
