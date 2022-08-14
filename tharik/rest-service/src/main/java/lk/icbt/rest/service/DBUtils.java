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
import java.util.List;

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
    
    public List<Student> getStudents() {
        return null;
    }
    
    public boolean addStudent(Student student) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
        
            int rows = statement.executeUpdate("INSERT INTO students (`id`, `name`, `dob`) VALUES ('" 
                    + student.getId() + "', '" + student.getName() +  "', '" + student.getDob() + "')");
            
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }  
        return false;
    }
    
    public boolean updateStudent(Student student) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `students` SET `name` = '" + student.getName() + "', `dob` = '" 
                    + student.getDob() + "' WHERE (`id` = '"  + student.getId() + "')");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }  
        return false;
    }
    
    public boolean deleteStudent(String id) {
                try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("DELETE FROM `students` WHERE (`id` = '" + id + "');");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }  
        return false;
    }
}
