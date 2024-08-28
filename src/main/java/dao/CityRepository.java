package dao;

import dataBase.Db;
import model.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityRepository {
    private final Connection connection;


    public CityRepository() throws SQLException {
        connection = new Db().getConnection();
    }

    public void createTable() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("create table if not exists city(" +
                "id serial primary key," +
                "title varchar);");
        statement.execute();
        statement.close();
    }

    public String saveCity(City city) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into city(title) values(?)");
        statement.setString(1,city.getTitle());
        statement.execute();
        statement.close();
        return "successfully saved ✔";
    }

    public List<City> getAllCity() throws SQLException {
        List<City> list = new ArrayList<>();
        Statement st = connection.createStatement();
        ResultSet resultSet = st.executeQuery("select * from city");
        while (resultSet.next()){
            City city = new City(resultSet.getLong("id"),resultSet.getString("title") );
            list.add(city);
        }
        return list;
    }
}
