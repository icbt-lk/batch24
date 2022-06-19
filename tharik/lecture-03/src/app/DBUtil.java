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
public interface DBUtil {
    public Employee getEmployee();
    public boolean addEmployee();
    public boolean updateEmployee();
    public boolean deleteEmployee();
}
