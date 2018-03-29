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
public class DocumentManagerImp extends DocumentManager {

    @Override
    public void checkDocument(Document document) {
        System.out.println("Dokuman kontrol edildi...");
    }

    @Override
    public Document openDocument(String s) {
        System.out.println(s+ " dokumani acildi...");
        return new Pdf();
    }
}