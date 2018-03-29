/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.facade;

/**
 *
 * @author Suleyman
 */
public class FacadeImpOne implements KomponentFacade {

    @Override
    public void doSomething() {
        new BirSinif().doSomething();
    }
}