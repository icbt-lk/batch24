/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture.pkg03;

/**
 *
 * @author hnd
 */
public class Student extends Person {
    private String stId;

    public Student() {
        this.stId = "";
    }

    public Student(String stId, String name, String nic, String dateOfBirth) {
        super(name, nic, dateOfBirth);
        this.stId = stId;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }
    
    
}
