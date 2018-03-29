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
public class TvAcKomutu implements Komut{

    private Televizyon tv=null;

    public TvAcKomutu(Televizyon tv){
        this.tv=tv;
    }
    
    @Override
    public void execute() {
        this.tv.ac();
    }
    
}
