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
public class UretimImpTwo implements Uretim{

    private FabrikaTwo fabrika = new FabrikaTwo();
    
    @Override
    public void produceDefter() {
        fabrika.produceMuzikDefteri();
    }

    @Override
    public void produceKalem() {
        fabrika.produceKursunKalem();
    }
    
}
