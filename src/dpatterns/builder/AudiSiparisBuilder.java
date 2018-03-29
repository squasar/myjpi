/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.builder;

/**
 *
 * @author Suleyman
 */
public class AudiSiparisBuilder extends SiparisBuilder{

    public AudiSiparisBuilder(){
    }
    
    @Override
    public void setBrand(String brand) {
        getCar().setBrand(new Brand(brand));
    }

    @Override
    public void setModel(String model) {
        getCar().setModel(new Model(model));
    }

    @Override
    public void setBeygirGucu(int bg) {
        getCar().setBeygirGucu(bg);
    }

    @Override
    public void setRenk(String renk) {
        getCar().setRenk(renk);
    }   
}