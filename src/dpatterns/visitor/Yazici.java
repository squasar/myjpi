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
public interface Yazici {
    
    void print();
    void accept(Visitor v);    
}
