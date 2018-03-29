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

/*Bu sablonda; soyut siniflari ve bu siniflarin implementasyonu ayrilarak, sinif hiyerarsisi
daha kullanisli bir hale getirmek amactir. Boyle bir ayrim, programin calisma
zamaninda degisik implementasyonlarinin kullanilmasina izin verir.*/
public class Test {
    
    public static void main(String[] args){
        
        Envanter defter=new Defter(new UretimImpOne());
        defter.produce();
        
        defter=new Defter(new UretimImpTwo());
        defter.produce();
        
        
        Envanter kalem=new Kalem(new UretimImpOne());
        kalem.produce();
        
        kalem=new Kalem(new UretimImpTwo());
        kalem.produce();        
    }
}