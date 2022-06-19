/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import app.process.Process;

/**
 *
 * @author hnd
 */
public class App {
    public static void main(String[] args) {
        
        Process p = new Process();
        DBUtil util = new MongoDBUtil();
        p.execute(util);
        
    }
}
