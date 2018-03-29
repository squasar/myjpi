/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.protectionproxy;

/**
 *
 * @author Suleyman
 */
public interface BankaHesabi {
    
    public int paraCek(int miktar) throws Exception;
    public void paraYatir(int miktar);
    
    public String getIsim();
    public void setIsim(String isim);
    
    public String getSoyad();
    public void setSoyad(String soyad);
    
    public int getHesapDurumu();
    public void setHesapDurumu(int hesapDurumu);
    
    public boolean iptalEt();    
}