/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author hnd
 */
public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving by rotating front wheels");
    }

    @Override
    public void consume() {
        System.out.println("Car is consuming Petrol");
    }
    
}
