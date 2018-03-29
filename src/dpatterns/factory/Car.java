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

/*Factory tasarim sablonunda, framework yazilir. Soyut olarak tanimlanan siniflardan olusan framework lerde,
Factory tasarim sablonu kullanilarak, olusturulan bu soyut siniflardan nesneler olusturulabilir.*/

/*Burada yapilan is; araba uretiminde kullanilacak bir framework olusturmak. Araba uretim surecini soyut olarak tanimlayip,
tum araba uretimi yapan firmalara satis saglamak.*/
public abstract class Car {
    
    private String brand=null;//marka
    private String model=null;
    private int beygirGucu=0;
    
    public Car (String brand, String model, int beygirGucu){
        setBrand(brand);
        setModel(model);
        setBeygirGucu(beygirGucu);
    }

    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand=brand;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model=model;
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu=beygirGucu;
    }
}