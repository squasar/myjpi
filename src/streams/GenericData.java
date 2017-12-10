/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.Serializable;

/**
 *
 * @author Suleyman
 */
public class GenericData<T> implements Serializable {
    
    T object;
    Flow f;
    
    GenericData(T ob){
        object=ob;
    }
    
    public T getData(){
        return object;
    }
    
    public void setData(T o){
        object=o;
    }
    
    public GenericData getSerializedData(String filename){
        return f.serialize(filename, this);
    }
    
    public GenericData getDeserializedData(String filename){
        return f.deserialize(filename, this);
    }
    
}
