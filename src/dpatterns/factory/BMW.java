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

//BMW fabrikasinda araba uretimi...
public class BMW extends CarFactory {

    @Override
    public void createAuto() {
        getCarList().add(new Z4(170));
    }
    
}
