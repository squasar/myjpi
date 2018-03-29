/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.singleton;

/**
 *
 * @author Suleyman
 */
public class Test {
    public static void main(String[] args){
        
        for(int i=0; i<10 ; i++){
            Singleton.instance().printThis();
            //Hep ayni nesneyi ekrana yazacak.(uretilen tek nesne)
        }
    }
}
