/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Suleyman
 * @param <Keys>
 * @param <Values>
 * 
 */
public class GenericKeyValue<Keys, Values> {

    Vector<Keys> keys;
    Vector<Values> values;
    
    GenericKeyValue(Vector<Keys> gd_keys, Vector<Values> gd_values) {
        for(int i=0, j=0; i<gd_keys.capacity() || j<gd_values.capacity(); i++, j++){
            if(i<gd_keys.capacity()){
                keys.add((Keys) gd_keys.get(i));
            }
            if(j<gd_values.capacity()){
                values.add((Values) gd_values.get(j));
            }
        }
    }
    
    public void addKeyValuePair(GenericData<Keys> key, GenericData<Values> value){
        keys.add((Keys) key);
        values.add((Values) value);
    }
    
    public Hashtable getHashtable(){
        Hashtable htable = new Hashtable();
        for(int i=0; i<keys.capacity(); i++){
            htable.put(keys.get(i), values.get(i));
        }
        return htable;
    }
    
    public HashMap getHashMap(){
        HashMap hmap = new HashMap();
        for(int i=0; i<keys.capacity(); i++){
            hmap.put(keys.get(i), values.get(i));
        }
        return hmap;
    }
}