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
public class Adres extends AdresPrototype {
    
    public Adres(String sokak, String no, String semt, String sehir){
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
    }
}
