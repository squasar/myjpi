/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.observer;

import java.util.ArrayList;

/**
 *
 * @author Suleyman
 */
public class Hurriyet implements Gazete{

    private ArrayList<Abone> aboneler = new ArrayList<Abone>();
    
    @Override
    public void aboneEkle(Abone abone) {
        getAboneler().add(abone);
    }

    @Override
    public void aboneSil(Abone abone) {
        getAboneler().remove(abone);
    }

    @Override
    public void gazeteGonder() {
        for(int i=0;i<getAboneler().size();i++){
            getAboneler().get(i).update();
        }
    }
    
    public ArrayList<Abone> getAboneler(){
        return aboneler;
    }
    
    public void setAboneler(ArrayList<Abone> aboneler){
        this.aboneler=aboneler;
    }
    
}