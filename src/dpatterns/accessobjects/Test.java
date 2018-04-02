/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.accessobjects;

import java.util.List;

/**
 *
 * @author Suleyman
 */
public class Test {
    
    public static void main(String[] args){
        
        ApplicationController controller = new ApplicationController(new JdbcDAOImp());
        List<TestData> list=controller.getTestDataList();
        
        for(int i=0; i<list.size(); i++){
            TestData data=list.get(i);
            System.out.println(data.getTest1());
            System.out.println(data.getTest2());
        }
        
        controller.setDao(new DummyDAOImp());
        list=controller.getTestDataList();
        
        for(int i=0; i<list.size(); i++){
            TestData data=list.get(i);
            System.out.println(data.getTest1());
            System.out.println(data.getTest2());
        }
    }
}