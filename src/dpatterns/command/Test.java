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
public class Test {
    
    public static void main(String[] args){
        //Kumanda aletini olustur
        Kumanda kumanda = new Kumanda();
        //Sifir no lu tusa basarak tv yi acar
        kumanda.tusla(0);
        //Bir no lu tusa basarak tv yi kapatir.
        kumanda.tusla(1);        
    }    
}
