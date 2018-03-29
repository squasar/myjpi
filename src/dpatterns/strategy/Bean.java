/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.strategy;

import java.io.Serializable;

/**
 *
 * @author Suleyman
 */
public class Bean implements Serializable {
    
    private int counter;
    private String name;
    
    public int getCounter(){
        return counter;
    }
    
    public void setCounter(int counter){
        this.counter=counter;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }    
}