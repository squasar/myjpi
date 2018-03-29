/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.template;

/**
 *
 * @author Suleyman
 */
public class Pdf implements Document {

    //asagidaki metoda da gerek yok... (Test sinifini incele.)
    @Override
    public void open(String yol) {
        System.out.println("Belirtilen pdf aciliyor...");
    }    
}