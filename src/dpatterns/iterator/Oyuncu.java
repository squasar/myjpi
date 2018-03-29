/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.iterator;

/**
 *
 * @author Suleyman
 */
public class Oyuncu {
    
    private String ad;
    private int no;
    
    Oyuncu(String ad,int no){
        setAd(ad);
        setNo(no);
    }
    
    public void setAd(String ad){
        this.ad=ad;
    }
    
    public void setNo(int no){
        this.no=no;
    }
    
    public String getAd(){
        return ad;
    }
    public int getNo(){
        return no;
    }
}