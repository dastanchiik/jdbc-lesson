package dao;

import dataBase.Db;
import model.Country;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;

public class CountryRepository {
    private final Connection connection;

    public CountryRepository() throws SQLException {
        connection = new Db().getConnection();
    }

    public void createTable() throws SQLException {
        String str =
                """
            create table if not exists countries(
            id serial primary key,
            title varchar,
            population int
            );
    """;
        Statement statement = connection.createStatement();
        statement.execute(str);
        System.out.println("ankara Messiii!!!");
        statement.close();
    }

    public String saveCountry(Country country) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into countries(title, population) values(?,?);");
        statement.setString(1,country.getTitle());
        statement.setInt(2,country.getPopulation());
        statement.execute();
        statement.close();
        return "Siuuuuu";
    }
}
