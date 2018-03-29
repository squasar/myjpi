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
public class UretimImpOne implements Uretim {

    private FabrikaOne fabrika = new FabrikaOne();
    
    @Override
    public void produceDefter() {
        fabrika.produceKareliDefter();
    }

    @Override
    public void produceKalem() {
        fabrika.produceTukenmezKalem();
    }
    
}
