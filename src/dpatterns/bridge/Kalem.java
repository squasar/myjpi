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
public class Kalem extends Envanter{

    public Kalem(Uretim uretim) {
        super(uretim);
    }

    @Override
    public void produce() {
        produceKalem();
    }
    
    public void produceKalem(){
        getUretim().produceKalem();
    }
    
}
