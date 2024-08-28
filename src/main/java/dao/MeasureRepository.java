package dao;

import dataBase.Db;
import model.Measures;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MeasureRepository {
    private final Connection connection;

    public MeasureRepository() throws SQLException {
        connection = new Db().getConnection();
    }


    public void createTable() throws SQLException {
        String str =
                """
            create table if not exists measures(
            id serial primary key,
            name varchar,
            age int,
            ownCity varchar
            );
    """;
        Statement statement = connection.createStatement();
        statement.execute(str);
        System.out.println("ankara Messiii!!!");
        statement.close();
    }

    public String saveCountry(Measures measures) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into measures(name,age,ownCity) values(?,?,?);");
        statement.setString(1, measures.getName());
        statement.setInt(2,measures.getAge());
        statement.setString(3,measures.getOwnCity());
        statement.execute();
        statement.close();
        return "Siuuuuu";
    }

    public List<Measures> getAllMeasures() throws SQLException {
        List<Measures> list = new ArrayList<>();
        Statement st = connection.createStatement();
        ResultSet resultSet = st.executeQuery("select * from measures");
        while (resultSet.next()){
            Measures measures = new Measures(resultSet.getLong("id"),resultSet.getString("name"),resultSet.getInt("age"),resultSet.getString("ownCity") );
            list.add(measures);
        }
        return list;
    }
}
