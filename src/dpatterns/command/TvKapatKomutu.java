/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.command;

/**
 *
 * @author Suleyman
 */
public class TvKapatKomutu implements Komut{

    private Televizyon tv=null;

    public TvKapatKomutu(Televizyon tv){
        this.tv=tv;
    }
    
    @Override
    public void execute() {
        this.tv.kapat();
    }
    
}
