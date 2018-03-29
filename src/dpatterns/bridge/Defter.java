/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.bridge;

/**
 *
 * @author Suleyman
 */
public class Defter extends Envanter {

    public Defter(Uretim uretim) {
        super(uretim);
    }

    @Override
    public void produce() {
        produceDefter();
    }
    
    public void produceDefter(){
        getUretim().produceDefter();
    }    
}
