/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.visitor;

/**
 *
 * @author Suleyman
 */
public class Test {
    
    public static void main(String[] args){
        
        Yazici hp=new HPYazici();
        Yazici lexmark=new LexYazici();
        
        hp.print();
        lexmark.print();
        
        Visitor visitor=new FaxVisitor();
        
        hp.accept(visitor);
        lexmark.accept(visitor);
    }    
}