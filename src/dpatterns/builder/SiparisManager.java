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
/*Degisik parametreler kullanilarak, ayni tip kompleks yapida bir nesnenin olusturulmasi*/
/*Kompleks yapiya sahip nesnenin olusturulma surecinin, sistemin diger bolumlerinden bagimsiz
bir sekilde yapilmasi*/
public class SiparisManager {
    
    private SiparisBuilder builder;
    
    public Car createOrder(String brand, String model, String renk, int beygirgucu){        
        if(brand.equals("Ford")){
            builder=new FordSiparisBuilder();
        }
        else if(brand.equals("Audi")){
            builder=new AudiSiparisBuilder();
        }
        this.builder.setBeygirGucu(beygirgucu);
        this.builder.setBrand(brand);
        this.builder.setModel(model);
        this.builder.setRenk(renk);
        
        return this.builder.getCar();
    }
    
    public void printOrder(){
        System.out.println("Marka: "+this.builder.getCar().getBrand());
        System.out.println("Model: "+this.builder.getCar().getModel());
        System.out.println("Beygir Gucu: "+this.builder.getCar().getBeygirGucu());
        System.out.println("Renk: "+this.builder.getCar().getRenk());
    }
}