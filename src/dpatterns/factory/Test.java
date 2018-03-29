/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.factory;

/**
 *
 * @author Suleyman
 */

//Test sinifi A4 ve R8 model Audi marka araba uretimini tamame Audi sinifina birakiyor.
public class Test {
    
    public static void main(String[] args){
        
        CarFactory bmw = new BMW();
        CarFactory audi = new Audi();
        
        for(Car car : bmw.getCarList()){
            System.out.println(car.getBrand()+"  "+car.getModel()+"  "+car.getBeygirGucu());
        }
        for(Car car : audi.getCarList()){
            System.out.println(car.getBrand()+"  "+car.getModel()+"  "+car.getBeygirGucu());
        }
    }    
}