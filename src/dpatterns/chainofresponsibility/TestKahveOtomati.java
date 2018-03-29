/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.chainofresponsibility;

/**
 *
 * @author Suleyman
 */
public class TestKahveOtomati {
    
    private static MetalPara zincir=null;
    
    public static void main(String[] args){
        
        zincir = (new BirLira()).setNext((new ElliKurus()).
                setNext((new OnKurus()).setNext(new BesKurus())));
        
        paraAt(new ElliKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new BesKurus());
        paraAt(new BesKurus());
    }
    
    public static void paraAt(MetalPara para){
        System.out.println("Otomata "+para.toString()+" atildi...");
        zincir.check(para);
        System.out.println("--------------------");
    }
}
