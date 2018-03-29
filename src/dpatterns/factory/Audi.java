/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.factory;

/**
 *
 * @author Suleyman
 */
public class Audi extends CarFactory {

    @Override
    public void createAuto() {
        getCarList().add(new A4(120));
        getCarList().add(new R8(350));
    }
}
