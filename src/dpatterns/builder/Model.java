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
public class Model {
    private String model;
    
    public Model(String model){
        setModel(model);
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model=model;
    }
    
    public String toString(){
        return model;
    }
}