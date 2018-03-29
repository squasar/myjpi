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
public class Brand {
    
    private String brand;
    
    public Brand(String brand){
        setBrand(brand);
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public String toString(){
        return brand;
    }
}