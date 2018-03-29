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
public class FaxVisitor implements Visitor{

    @Override
    public void visit(HPYazici hpYazici) {
        System.out.println(hpYazici.toString()+" faks cekiyor...");
    }

    @Override
    public void visit(LexYazici lexYazici) {
        System.out.println(lexYazici.toString()+" faks cekemez...(implemente edilmedi!)");
    }
}
