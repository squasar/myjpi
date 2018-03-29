/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.memento;

import java.util.ArrayList;

/**
 *
 * @author Suleyman
 */
public class Dokument {
    
    private ArrayList<String> satirlar = new ArrayList<String>();
    
    public void addSatir(int index, String satir){
        getSatirlar().add(index,satir);
    }
    
    public void removeSatir(int index){
        getSatirlar().remove(index);
    }
    
    public Memento createMemento(){
        return new Memento(getSatirlar().toArray());
    }
    
    public void setMemento(Memento memento){
        getSatirlar().clear();
        Object[] tempSatirlar = memento.getElements();
        for(int i=0; i<tempSatirlar.length; i++){
            String satir = (String) tempSatirlar[i];
            getSatirlar().add(satir);
        }
    }
    
    public String toString(){
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<getSatirlar().size(); i++){
            temp.append(getSatirlar().get(i)).append(" \n");
        }
        return temp.toString();
    }
    
    public ArrayList<String> getSatirlar(){
        return satirlar;
    }
    
    public void setSatirlar(ArrayList<String> satirlar){
        this.satirlar = satirlar;
    }    
}