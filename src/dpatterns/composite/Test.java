/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.composite;

/**
 *
 * @author Suleyman
 */
public class Test {
    
    public static void main(String[] args){
        
        Bilgisayar bilgisayar=new Bilgisayar();
        
        Parca monitor=new Monitor();
        Parca klavye=new Klavye();
        Parca ram1024=new Ram1024();
        
        bilgisayar.parcaEkle(monitor);
        bilgisayar.parcaEkle(klavye);
        bilgisayar.parcaEkle(ram1024);
        
        System.out.println("Monitorun Fiyati: "+monitor.fiyatiNedir());
        System.out.println("Klavye Fiyati: "+klavye.fiyatiNedir());
        System.out.println("Ram1024 Fiyati: "+ram1024.fiyatiNedir());
        System.out.println("Toplam Fiyat: "+bilgisayar.fiyatiNedir());
    }
}