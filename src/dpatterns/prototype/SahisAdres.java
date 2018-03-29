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
public class SahisAdres extends AdresPrototype {
    
    private String isim;
    private String soyad;
    
    public SahisAdres(String sokak, String no, String semt, String sehir, String isim, String soyad){
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
        setIsim(isim);
        setSoyad(soyad);
    }
    
    public void setIsim(String isim){
        this.isim=isim;
    }
    
    public String getIsim(){
        return isim;
    }
    
    public void setSoyad(String soyad){
        this.soyad=soyad;
    }
    
    public String getSoyad(){
        return soyad;
    }
}
