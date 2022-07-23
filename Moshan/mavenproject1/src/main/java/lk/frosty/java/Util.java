/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.frosty.java;

/**
 *
 * @author Frosty
 */
public class Util {
    
    public static boolean authenticate(String username, String password){
        if (username != null && password != null){
            return username.equals("icbt") && password.equals("123");
        } else {
            return false;
        }
    }
    
    public static Student[] getStudents(){
        Student[] students = new Student[3];
        
        students[0] = new Student("S001", "John", "25");
        students[1] = new Student("S002", "James", "28");
        students[2] = new Student("S003", "Andrew", "24");
        
        return students;
    }
}
