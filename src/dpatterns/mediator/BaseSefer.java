/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.mediator;

/**
 *
 * @author Suleyman
 */
public abstract class BaseSefer implements Sefer {
    
    private boolean inisTamamlandi;
    private boolean kalkisTamamlandi;
    private boolean inisYapiyor;
    private boolean kalkisYapiyor;
    
    private Kule kule;
    
    public Kule getKule(){
        return kule;
    }
    
    public void setKule(Kule kule){
        this.kule=kule;
    }
    
    public boolean isInisTamamlandi(){
        return inisTamamlandi;
    }
    
    public boolean isKalkisTamamlandi(){
        return kalkisTamamlandi;
    }

    @Override
    public boolean isKalkisYapiyor() {
        return kalkisYapiyor;
    }

    @Override
    public boolean isInisYapiyor() {
        return inisYapiyor;
    }

    @Override
    public void setInisYapiyor(boolean value) {
        this.inisYapiyor=value;
    }

    @Override
    public void setKalkisYapiyor(boolean value) {
        this.kalkisYapiyor=value;
    }

    @Override
    public void setKalkisTamamlandi(boolean value) {
        this.kalkisTamamlandi=value;
        this.kalkisYapiyor=false;
        System.out.println(this.toString()+" kalkisi tamamladi...");
    }

    @Override
    public void setInisTamamlandi(boolean value) {
        this.inisTamamlandi=value;
        this.inisYapiyor=false;
        System.out.println(this.toString()+" inisi tamamladi...");
    }    
}