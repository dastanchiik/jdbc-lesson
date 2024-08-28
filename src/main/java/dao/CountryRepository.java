package dao;

import dataBase.Db;
import model.Country;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<Country> getAllCity() throws SQLException {
        List<Country> list = new ArrayList<>();
        Statement st = connection.createStatement();
        ResultSet resultSet = st.executeQuery("select * from countries");
        while (resultSet.next()){
            Country city = new Country(resultSet.getLong("id"),resultSet.getString("title"),resultSet.getInt("population") );
            list.add(city);
        }
        return list;
    }
}
