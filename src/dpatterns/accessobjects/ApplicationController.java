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
public class ApplicationController {
    
    private DAO dao;
    
    public DAO getDao(){
        return dao;
    }
    
    public void setDao(DAO dao){
        this.dao=dao;
    }
    
    public TestData getTestData(int id){
        return dao.getTestData(id);
    }

    ApplicationController(DAO dao) {
        this.dao=dao;
    }

    List<TestData> getTestDataList() {
        return dao.getTestDataList();
    }
}
