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
public class Engine {
    
    private State state;
    
    public Engine(){
        setState(new EngineOffState());
        System.out.println("Motor Kapali...");
    }
    
    public void start(){
        getState().on(this);
    }
    
    public void stop(){
        getState().off(this);
    }
    
    public State getState(){
        return state;
    }
    
    public void setState(State state){
        this.state = state;
    }    
}