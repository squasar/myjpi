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
public class Test {
    
    public static void main(String[] args){
        
        Kule kule=new IstanbulAtaturkHavaLimaniKule();
        
        Sefer thy=new Thy1983(kule);
        Sefer atlas=new Atlas99(kule);
        
        thy.inisIzniAl();
        atlas.inisIzniAl();
        thy.setInisTamamlandi(true);
        atlas.inisIzniAl();
        thy.inisIzniAl();
        atlas.setInisTamamlandi(true);
        
        atlas.kalkisIzniAl();
        thy.kalkisIzniAl();
        thy.kalkisIzniAl();
        atlas.setKalkisTamamlandi(true);
        thy.kalkisIzniAl();
    }    
}