/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.factory;

import java.util.ArrayList;

/**
 *
 * @author Suleyman
 */
public abstract class CarFactory {
    
    //Araba fabrikasinin urettigi degisik modeldeki arabalari tutan liste.
    private ArrayList<Car> car_list = new ArrayList<Car>();
    
    //Fabrika olusur olusmaz, createAuto() metodu sayesinde araba uretimine baslanir.
    //Alt siniflar tarafindan implemente edilir. Belirli bir marka ve modelin olusturulmasinda kullanilir.
    public CarFactory(){
        this.createAuto();
    }
    public abstract void createAuto();
    
    //get ve set metodlari...
    public ArrayList<Car> getCarList(){
        return car_list;
    }
    
    public void setCarList(ArrayList<Car> car_list){
        this.car_list=car_list;
    }
}