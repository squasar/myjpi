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
//Kirmizi elma ve dolma biber disinda baska bir nesne ailesine ihtiyac duyulursa,
//baska bir factory class olusturulmalidir.(bkz. ConcFactoryTwo)
public class ConcFactoryOne implements AbstractFactory {

    @Override
    public Elma getElma() {
        return new KirmiziElma();
    }

    @Override
    public Biber getBiber() {
        return new DolmaBiber();
    }
    
}
