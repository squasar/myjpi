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
public abstract class DocumentManager {
    
    public final Document getDocument(String name){
        Document dokument=openDocument(name);
        checkDocument(dokument);
        return dokument;
    }
    
    public abstract void checkDocument(Document document);
    public abstract Document openDocument(String s);
}
