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
public interface DAO {
    
    //TestData listesini almak icin tanimlanan metod
    List<TestData> getTestDataList();
    
    //id si verilen bir testten testdata kaydini bulup getiren metod
    TestData getTestData(int id);
    
}
