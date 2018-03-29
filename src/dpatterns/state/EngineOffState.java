/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.state;

/**
 *
 * @author Suleyman
 */
public class EngineOffState implements State {

    
    @Override
    public void on(Engine engine) {
        engine.setState(new EngineOnState());
        System.out.println("Motor calisti...");
    }

    @Override
    public void off(Engine engine) {
        System.out.println("Motor kapali durumda!");
    }    
}
