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
public class EngineOnState implements State{

    @Override
    public void on(Engine engine) {
        System.out.println("Motor calisir durumda!");
    }

    @Override
    public void off(Engine engine) {
        engine.setState(new EngineOffState());
        System.out.println("Motor durduruldu...");
    }
    
}
