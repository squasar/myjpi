/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.flyweight;

/**
 *
 * @author Suleyman
 */
public class Harf {
    
    private String harf;
    
    public Harf(String h){
        this.harf=h;
    }
    
    public String getHarf(){
        return harf;
    }
    
    public void setHarf(String harf){
        this.harf=harf;
    }
}