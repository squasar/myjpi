/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.bridge;

/**
 *
 * @author Suleyman
 */

public abstract class Envanter {
    
    private Uretim uretim;//Envanter ile Uretim arasinda KOPRU kuruldu.
    
    public abstract void produce();//uretim olayinin yapilmasi
    
    public Envanter(Uretim uretim){
        setUretim(uretim);
    }
    
    public void setUretim(Uretim uretim){
        this.uretim=uretim;
    }
    
    public Uretim getUretim(){
        return uretim;
    }
}
