/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.java;

/**
 *
 * @author tharik
 */
public class Util {
    public static Student[] getStudents() {
        Student[] students = new Student[3];
        
        students[0] = new Student("ST001", "John", "25");
        students[1] = new Student("ST002", "George", "26");
        students[2] = new Student("ST003", "James", "27");
        
        return students;
    }
}
