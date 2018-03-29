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
public class LexYazici implements Yazici{

    public String toString(){
        return "Lex Yazici";
    }
    
    @Override
    public void print(){
        System.out.println(this.toString()+" yazicisindan cikti aliniyor...");
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
