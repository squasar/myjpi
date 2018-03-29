/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.strategy;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author Suleyman
 */
public class SerializeStrategy implements Strategy {

    @Override
    public void save(Bean bean) {
        try{
            ObjectOutput out=new ObjectOutputStream(
            new FileOutputStream("C:/temp/bean.ser"));
            
            out.writeObject(bean);
            out.close();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}