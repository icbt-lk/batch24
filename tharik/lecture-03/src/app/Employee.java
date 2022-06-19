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
public class Employee extends Person {
    private String empNo;

    public Employee() {
        this.empNo = "";
    }

    public Employee(String empNo, String name, String nic, String dateOfBirth) {
        super(name, nic, dateOfBirth);
        this.empNo = empNo;
    }
    
    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
}
