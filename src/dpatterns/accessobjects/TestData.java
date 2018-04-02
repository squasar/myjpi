/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.accessobjects;

/**
 *
 * @author Suleyman
 */

//veritabaninda asagidaki gibi bir tablonun oldugu varsayilir...
/*
------------------------------------
|    id   |   test1   |   test2    |
------------------------------------
|    1    |    Abc    |    def     |
------------------------------------
|    2    |    123    |    345     |
------------------------------------
|    3    |    xxx    |    yyy     |
------------------------------------

*/

public class TestData {
    
    private String test1;
    private String test2;
    private int id;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public String getTest1(){
        return test1;
    }
    
    public void setTest1(String test1){
        this.test1=test1;
    }
    
    public String getTest2(){
        return test2;
    }
    
    public void setTest2(String test2){
        this.test2=test2;
    }    
}