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
public class ConcFactoryTwo implements AbstractFactory {

    @Override
    public Elma getElma() {
        return new YesilElma();
    }

    @Override
    public Biber getBiber() {
        return new YesilBiber();
    }
    
}
