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
public class Fenerbahce implements Takim{
    
    private Oyuncu [] takim=new Oyuncu[5];
    
    public Fenerbahce(){
        takim[0]=new Oyuncu("Ismail",4);
        takim[1]=new Oyuncu("Willie",5);
        takim[2]=new Oyuncu("Semih",9);
        takim[3]=new Oyuncu("Ibrahim",10);
        takim[4]=new Oyuncu("Serhat",33);
    }
    
    public Oyuncu[] getTakim(){
        return takim;
    }
    
    public void setTakim(Oyuncu[] takim){
        this.takim=takim;
    }

    @Override
    public Iterator getIterator() {
        return new ArrayIterator(getTakim());
    }
    
}
