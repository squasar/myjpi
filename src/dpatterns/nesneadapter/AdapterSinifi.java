/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.nesneadapter;

/**
 *
 * @author Suleyman
 */
public class AdapterSinifi extends KullanilanSinif {
    
    private AdapteEdilenSinif adapteEdilenSinif = new AdapteEdilenSinif();

    public void birMetod(){
        getAdapteEdilenSinif().herhangiBirMetod();
    }
    
    public AdapteEdilenSinif getAdapteEdilenSinif(){
        return adapteEdilenSinif;
    }
    
    public void setAdapteEdilenSinif(AdapteEdilenSinif adapteEdilenSinif){
        this.adapteEdilenSinif=adapteEdilenSinif;
    }
}