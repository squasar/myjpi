/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Suleyman
 * @param <GenericData>
 */
public class GenericKeyValue<GenericData> {

    GenericData [] keys;
    GenericData [] values;
    
    GenericKeyValue(GenericData[] gd_keys, GenericData[] gd_values) {
        for(int i=0, j=0; i<keys.length || j<values.length; i++, j++){
            if(i<keys.length){
            keys[i]=gd_keys[i];
            }
            if(j<values.length){
            values[j]=gd_values[j];
            }
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Hashtable getHashtable(){
        Hashtable htable = new Hashtable();
        for(int i=0; i<keys.length; i++){
            htable.put(keys[i], values[i]);
        }
        return htable;
    }
    
    public HashMap getHashMap(){
        HashMap hmap = new HashMap();
        for(int i=0; i<keys.length; i++){
            hmap.put(keys[i], values[i]);
        }
        return hmap;
    }
}