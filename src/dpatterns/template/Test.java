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
public class Test {
    
    public static void main(String[] args){
        
        DocumentManager manager=new DocumentManagerImp();
        Document document=manager.getDocument("test_dokumani");
    }
    
}