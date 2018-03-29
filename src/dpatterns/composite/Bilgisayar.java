/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.composite;

import java.util.ArrayList;

/**
 *
 * @author Suleyman
 */
public class Bilgisayar implements Parca{

    @Override
    public int fiyatiNedir() {
        int fiyat=0;
        for(int i=0; i<getParcaListem().size(); i++){
            fiyat += getParcaListem().get(i).fiyatiNedir();
        }
        return fiyat;
    }
    
    private ArrayList<Parca> parcaListem = new ArrayList<Parca>();
    
    public ArrayList<Parca> getParcaListem(){
        return parcaListem;
    }
    
    public void setParcaListem(ArrayList<Parca> parcaListem){
        this.parcaListem=parcaListem;
    }
    
    public void parcaEkle(Parca parca){
        getParcaListem().add(parca);
    }
    
    public void parcaSil(Parca parca){
        if(getParcaListem().contains(parca)){
            getParcaListem().remove(parca);
        }
    }
    
    public Parca parcaVer(int index) throws Exception{
        Parca parca=null;
        try{
            parca=getParcaListem().get(index);
        }
        catch(Exception e){
            throw new Exception(index+" no lu parca bulunamadi.");
        }
        return parca;
    }
}