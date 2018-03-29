/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.flyweight;

/**
 *
 * @author Suleyman
 */
public class Test {
    
    public static void main(String[] args){
        
        String ilkSatir="Bu ilk satirdir";
        String ikinciSatir="Bu ikinci satirdir";
        
        HarfManager.instance().addSatir(ilkSatir, 1);
        HarfManager.instance().addSatir(ikinciSatir, 2);
        
        HarfManager.getDokument();
    }
    
}
