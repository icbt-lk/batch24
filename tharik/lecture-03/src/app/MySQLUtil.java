/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

/**
 *
 * @author hnd
 */
public class MySQLUtil implements DBUtil {

    @Override
    public Employee getEmployee() {
        //Logic for mysql
        return new Employee();
    }

    @Override
    public boolean addEmployee() {
        return true;
    }

    @Override
    public boolean updateEmployee() {
        return true;
    }

    @Override
    public boolean deleteEmployee() {
        return true;
    }
    
}
