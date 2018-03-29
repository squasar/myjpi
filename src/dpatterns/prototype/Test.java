/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.prototype;

/**
 *
 * @author Suleyman
 */

/*Adres olusturma bedeli yuksek bir nesne degil ama kompleks sistemlerde
new ile olusturmak yerine bu sablonun kullanilmasi daha uygundur*/

/*Bu sablon, sistemdeki alt siniflari azaltmak icin de kullanilabilir. Ornegin; adres defteri
programina dernek ve kurum adreslerini de eklemek istersek, DernekAdres ve KurumAdres
isminde iki yeni alt sinif olusturmak yerine AdresPrototype sinifina dernek ve kurum
icin gerekli degiskenleri ekleyerek, DernekAdres ve KurumAdres siniflari yerine
Adres sinifini kullanabiliriz.*/

/*Sistem uzerinde buyuk ve olusturmasi zaman alan nesneler varsa, veya sistem bunyesinde
kullanilan sinif hiyerarsilerini kucultmek ve kullanilan sinif adedini azaltmak gerekiyorsa,
bu sablon kullanilir.*/
public class Test {
    
    public static void main(String[] args) throws CloneNotSupportedException{
        
        Adres adres = new Adres("Ataturk cad.","10","Atasehir","Istanbul");
        adres.printAdres();
        
        //Yeni nesne uretmeden, clone uzerinden islem yapiyoruz...
        Adres adres2=(Adres) adres.clone();
        
        //islemler
        adres2.setSokak("Kizilay");
        adres2.setNo("06");
        adres2.setSemt("Hacettepe/Altindag");
        adres2.setSehir("Ankara");
        
        adres2.printAdres();
    }
}