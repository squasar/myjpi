/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.sinifadapter;

/**
 *
 * @author Suleyman
 */

/*Bu adapter yardimiyla beraber calisamayacak durumda olan siniflar
birlikte calisabilir hale getirilir. (KullaniciSinif - AdapteEdilenSinif)*/

/*Bir adapter tanimlanir; kullanilan bir interface i diger sinifin da kullanmasi saglanir.
Bunu diger sinifi extend ederek yapar.*/
public class KullaniciSinif {
    
    public static void main(String[] args){
        
        BirInterface birInterface=new AdapterSinifi();
        birInterface.birMethod();
    }
}
