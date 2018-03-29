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
public interface Sefer {
    
    void inisIzniAl();
    void kalkisIzniAl();
    boolean isKalkisYapiyor();
    boolean isInisYapiyor();
    void setInisYapiyor(boolean value);
    void setKalkisYapiyor(boolean value);
    void setKalkisTamamlandi(boolean value);
    void setInisTamamlandi(boolean value);    
}
