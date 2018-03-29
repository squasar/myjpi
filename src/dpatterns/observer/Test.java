/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.observer;

/**
 *
 * @author Suleyman
 */
public class Test {
    
    public static void main(String[] args){
        Gazete hurriyet = new Hurriyet();
        
        Abone musteri1= new Musteri("Tarik","Akan");
        musteri1.aboneOl(hurriyet);
        
        Abone musteri2= new Musteri("Filiz","Akin");
        musteri2.aboneOl(hurriyet);
        
        hurriyet.gazeteGonder();
        musteri2.aboneligiIptalEt();
        hurriyet.gazeteGonder();
    }
    
}
