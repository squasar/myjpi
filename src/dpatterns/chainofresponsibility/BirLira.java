/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.chainofresponsibility;

/**
 *
 * @author Suleyman
 */
//100 kurus = 1 tl
public class BirLira extends MetalPara {
    
    public String toString(){
        return "1 Lira";
    }
    
    public BirLira(){
        setValue(100);
    }
    
}
