/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.command;

/**
 *
 * @author Suleyman
 */
public class Kumanda {
    
    public Komut[] tus=new Komut[2];
    
    public Kumanda(){
        Televizyon tv=new Televizyon();
        tus[0]=new TvAcKomutu(tv);
        tus[1]=new TvKapatKomutu(tv);
    }
    
    public void tusla(int i){
        if(i>tus.length || i<0){
            throw new RuntimeException(""+"Tus Gecersizdir...");
        }
        tus[i].execute();
    }
    
}