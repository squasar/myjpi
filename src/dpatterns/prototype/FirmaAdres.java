/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.prototype;

/**
 *
 * @author Suleyman
 */
public class FirmaAdres extends AdresPrototype {
    
    private String firma;
    
    public FirmaAdres(String sokak, String no, String semt, String sehir, String firma){
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
        setFirma(firma);        
    }
    
    public void setFirma(String firma){
        this.firma=firma;
    }
    
    public String getFirma(){
        return firma;
    }
}
