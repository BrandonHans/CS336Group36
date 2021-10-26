package com.company;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs336group36", "root", "12345"); //Connection to DB


            Statement statement = connection.createStatement(); //Declaring a new statement as "statement"
            ResultSet resultSet = statement.executeQuery("select * from users"); //Executed query


            while (resultSet.next()) { //This while loop is prining the username column from the "users" table
                System.out.println(resultSet.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //TODO "Start working on the HTML/Front-End side of the project since backend DB is connected"
}
