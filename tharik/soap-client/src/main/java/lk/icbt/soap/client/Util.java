/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.soap.client;

import icbt.StudentService;
import icbt.StudentService_Service;

/**
 *
 * @author tharik
 */
public class Util {
     public static boolean authenticate(String username, String password) {
        if (username != null && password != null) {
             StudentService_Service service = new StudentService_Service();
             StudentService proxy = service.getStudentServicePort();
             return proxy.authenticate(username, password);
             
        } else {
            return false;
        }
    }
}
