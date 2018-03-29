/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.facade;

/**
 *
 * @author Suleyman
 */
public class FacadeFactory {
    
    //singleton
    private static FacadeFactory instance=new FacadeFactory();
    
    private FacadeFactory(){
        
    }
    
    public static FacadeFactory instance(){
        return instance;
    }
    
    //KomponentFacade implementasyonu
    public KomponentFacade getFacade(){
        return new FacadeImpOne();
    }
    
}
