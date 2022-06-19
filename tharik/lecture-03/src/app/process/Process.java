/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.process;

import app.DBUtil;

/**
 *
 * @author hnd
 */
public class Process {
    public void execute(DBUtil util) {
        util.addEmployee();
        
        
        util.getEmployee();
        
        
        util.deleteEmployee();
        
        
        util.updateEmployee();
    }
}
