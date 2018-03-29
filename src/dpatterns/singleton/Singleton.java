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

/*Bazi sartlarda, bir siniftan sadece bir nesnenin olusturulmasi ve olusturulan bu nesnenin
tum sistemde kullanilmasi gerekebilir. Bu sablon kullanilirsa, bir siniftan sadece bir tane nesne
olusturulmasi garanti altina alinir ve ayni nesne tum sistemde kullanilir.*/
public class Singleton {

    //Tek nesne
    private static Singleton instance=null;
    
    //Double check locking yapabilmek icin kullanilan nesne...
    //Double check locking sayesinde, thread lar senkronize bir sekilde calisir.
    private static Object lock=new Object();
    
    private Singleton(){
        System.out.println("singleton.init()");
    }
    
    //Bu tek nesneye ulasmak icin instance() metodu kullanilir.
    
    public static Singleton instance(){
        if(instance == null){
            //Double checked locking
            synchronized (lock){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    
    //Singletonda olusabilecek tek nesneyi ekrana yazdiran metod   
    public void printThis(){
        System.out.println(this);
    }
}