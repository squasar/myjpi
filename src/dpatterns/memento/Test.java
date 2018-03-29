/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.memento;

/**
 *
 * @author Suleyman
 */
public class Test {
    
    public static void main(String[] args){
        Dokument dokument = new Dokument();
        dokument.addSatir(0, "+++++++++++++++++");
        dokument.addSatir(1, "    Hello World!    ");
        
        //dokumanin son halini memento nesnesine aktariyoruz.
        
        Memento memento = dokument.createMemento();
        System.out.println("\nDokumanin ilk hali: \n\n"+dokument.toString());
        
        //degisiklik yapimi
        dokument.removeSatir(1);
        dokument.addSatir(1, "    Merhaba Dunya!    ");
        
        System.out.println("\nDokumanin yeni hali: \n\n"+dokument.toString());
        
        //dokumani eski haline cevirme
        dokument.setMemento(memento);
        System.out.println("\nDokumanin en son hali: \n\n"+dokument.toString());
        
    }    
}