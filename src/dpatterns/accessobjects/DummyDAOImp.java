/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.accessobjects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suleyman
 */

//bir dummy, TestData olusturarak geri verir.
public class DummyDAOImp implements DAO {

    @Override
    public List<TestData> getTestDataList() {
        ArrayList<TestData> list = new ArrayList<TestData>();
        
        TestData data=new TestData();
        data.setTest1("test1");
        data.setTest2("test2");
        list.add(data);
        
        data=new TestData();
        data.setTest1("test111");
        data.setTest2("test222");
        list.add(data);
        
        return list;
    }

    @Override
    public TestData getTestData(int id) {
        TestData data=new TestData();
        data.setTest1("test1");
        data.setTest2("test2");
        return data;
    }

    
}
