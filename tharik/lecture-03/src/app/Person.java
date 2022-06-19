/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import lecture.pkg03.*;

/**
 *
 * @author hnd
 */
public abstract class Person {
    private String name;
    private String nic;
    private String dateOfBirth;

    
    public Person() {
        this.name = "";
        this.nic = "";
        this.dateOfBirth = ""; 
    }

    public Person(String name, String nic, String dateOfBirth) {
        this.name = name;
        this.nic = nic;
        this.dateOfBirth = dateOfBirth;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
}
