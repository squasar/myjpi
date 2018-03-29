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
public class Test {
    
    public static void main(String[] args){
        EfesPilsen efesPilsen = new EfesPilsen();
        Iterator it = efesPilsen.getIterator();
        
        while(it.hasNext()){
            Oyuncu oyuncu=(Oyuncu) it.next();
            System.out.println(oyuncu.getAd());
        }
        
        Fenerbahce fenerbahce=new Fenerbahce();
        it=fenerbahce.getIterator();
        
        while(it.hasNext()){
            Oyuncu oyuncu = (Oyuncu) it.next();
            System.out.println(oyuncu.getAd());
        }
    }    
}