package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {

    public DatabaseConnection() {
        connection();
    }

    public void connection() {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs336group36", "root", "12345");

            //Statement statement = connection.createStatement();

            //ResultSet resultSet = statement.executeQuery("select * from users");

            //while (resultSet.next()) {
            //System.out.println(resultSet.getString("username"));
            //}
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Possibly make some more methods within this class that query/select important tables that we need often??
    //This shit aint workin lmao maybe we dont do this
}
