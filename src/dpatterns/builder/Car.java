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
public class Car {
    
    private Brand brand=null;//marka
    private Model model=null;
    private String renk=null;
    private int beygirGucu=0;
    
    public Car(){
    
    }

    public Brand getBrand() {
        return brand;
    }
    
    public void setBrand(Brand brand) {
        this.brand=brand;
    }
    
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model=model;
    }
    
    public String getRenk(){
        return renk;
    }
    
    public void setRenk(String renk){
        this.renk=renk;
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu=beygirGucu;
    }
}
