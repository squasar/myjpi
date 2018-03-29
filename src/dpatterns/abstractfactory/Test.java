/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.abstractfactory;
/**
 *
 * @author Suleyman
 */
public class Test {
    public static void main(String[] args){
        
        //1.fabrika kullaniliyor...
        AbstractFactory factory = new ConcFactoryOne();
        Elma elma = factory.getElma();
        Biber biber = factory.getBiber();
        
        System.out.println(elma.getType());
        System.out.println(biber.getType());
        
        //2.fabrika kullaniliyor...
        factory = new ConcFactoryTwo();
        elma=factory.getElma();
        biber=factory.getBiber();
        
        System.out.println(elma.getType());
        System.out.println(biber.getType());
    }   
}