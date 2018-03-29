/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.iterator;

import java.util.ArrayList;

/**
 *
 * @author Suleyman
 */
public class ArrayListIterator implements Iterator {
    
    private ArrayList<Oyuncu> takim;
    private int pozisyon;
    
    public void setPozisyon(int pozisyon){
        this.pozisyon=pozisyon;
    }
    
    public int getPozisyon(){
        return pozisyon;
    }
    
    public ArrayListIterator(ArrayList<Oyuncu> takim){
        setTakim(takim);
    }

    @Override
    public boolean hasNext() {
        if((pozisyon >= getTakim().size()) || ((getTakim().get(pozisyon)==null))){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Oyuncu oyuncu=getTakim().get(pozisyon);
        pozisyon++;
        return oyuncu;        
    }
    
    public ArrayList<Oyuncu> getTakim(){
        return takim;
    }
    
    public void setTakim(ArrayList<Oyuncu> takim){
        this.takim=takim;
    }
    
    
}