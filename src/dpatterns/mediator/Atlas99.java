/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.mediator;

/**
 *
 * @author Suleyman
 */
public class Atlas99 extends BaseSefer {

    public Atlas99(Kule kule){
        setKule(kule);
        kule.seferEkle(this);
    }
    
    public String toString(){
        return "Atlas 99";
    }
    
    @Override
    public void inisIzniAl() {
        getKule().inisIzniVer(this);
    }

    @Override
    public void kalkisIzniAl() {
        getKule().kalkisIzniVer(this);
    }    
}