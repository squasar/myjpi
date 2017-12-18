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
 * 
 */
public class GenericKeyValue<Keys, Values> {

    Keys [] keys;
    Values [] values;
    
    GenericKeyValue(Keys[] gd_keys, Values[] gd_values) {
        for(int i=0, j=0; i<gd_keys.length || j<gd_values.length; i++, j++){
            if(i<gd_keys.length){
            keys[i]=gd_keys[i];
            }
            if(j<gd_values.length){
            values[j]=gd_values[j];
            }
        }
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