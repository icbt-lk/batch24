/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tharik
 */
public class DBUtils {
    static final String URL = "jdbc:mysql://localhost:3306/icbt?autoReconnect=true&useSSL=false";
    static final String USERNAME = "st_user";
    static final String PASSWORD = "123";
     
    public Student getStudent(String id) {
        Student student = null;
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from students WHERE id='" + id + "'");
            
            while(resultSet.next()) {
                student = new Student(resultSet.getString("id"), 
                        resultSet.getString("name"), 
                        resultSet.getString("dob"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }    
        return student;
    }
}
