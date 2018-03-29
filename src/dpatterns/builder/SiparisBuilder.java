/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.builder;

/**
 *
 * @author Suleyman
 */
public abstract class SiparisBuilder {
    
    private Car car=null;
    
    public SiparisBuilder(){
        
    }
    
    public Car getCar(){
        if(car==null) car=new Car();
        return car;
    }
    
    public abstract void setBrand(String brand);
    public abstract void setModel(String model);
    public abstract void setBeygirGucu(int bg);
    public abstract void setRenk(String renk);
}
