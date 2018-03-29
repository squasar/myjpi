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

public interface AbstractFactory {
    /*Elma tipinde nesne olusturmak icin*/
    public Elma getElma();
    /*Biber tipinde nesne olusturmak icin*/
    public Biber getBiber();
}
