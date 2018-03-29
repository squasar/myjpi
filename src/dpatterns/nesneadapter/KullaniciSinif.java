/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.nesneadapter;

/**
 *
 * @author Suleyman
 */

/*Nesne uzerinden adapter olusturma... bazi durumlarda AdapteEdilenSinif ta extend 
yapilamayabilir. Boyle durumlarda sinifadapter yerine nesneadapter kullanmak
bir alternatiftir.*/

/*Bir sistemde mevcut siniflar kullanilmak istenildiginde, lakin sinifin sunmus
oldugu metot ve degiskenler istenilen cinsten degilse;

Tekrar kullanilabilir ve sistemin diger bolumlerinden bagimsiz bir sinif veya
kompenent olusturulmak istendiginde;

Bu sablon kullanilir...*/
public class KullaniciSinif {
 
    public static void main(String[] argas){
        
        KullanilanSinif kullanilanSinif=(KullanilanSinif) new AdapterSinifi();
        kullanilanSinif.birMetod();
    }
}