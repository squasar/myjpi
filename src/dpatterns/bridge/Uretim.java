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

/*Bu interface sayesinde;

UretimImpOne ve UretimImpTwo bu metodlari implemente ederek, sistemin baska
bolumleri tarafindan kullanilabilir hale getiriyorlar.*/
public interface Uretim {
    
    public void produceDefter();
    public void produceKalem();
}
