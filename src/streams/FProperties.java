/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suleyman
 * 
 * clear() metodu dosyadan da remove ediyor mu? test et.
 * 
 */
public class FProperties {
    
    Properties defprop=new Properties();
    Properties changedprop=new Properties();
    String def_prop_filename;
    String chan_prop_filename;
    
    FProperties(String default_properties_filename, String changed_properties_filename){
        def_prop_filename=default_properties_filename;
        chan_prop_filename=changed_properties_filename;
    }
    
    public void setAllProps(GenericData[] gd_keys, GenericData[] gd_values) throws IOException, FileNotFoundException{
        
        GenericKeyValue<GenericData> obj=new GenericKeyValue<GenericData>(gd_keys,gd_values);
        Hashtable th= obj.getHashtable();
        FileInputStream in_def = null;
        FileInputStream in_chan = null;
        FileOutputStream out_def = null;
        FileOutputStream out_chan = null;
        try {
            in_def = new FileInputStream(def_prop_filename);
            in_chan = new FileInputStream(chan_prop_filename);
            out_def = new FileOutputStream(def_prop_filename);
            out_chan = new FileOutputStream(chan_prop_filename);
            
            defprop.load(in_def);
            changedprop.load(in_chan);
           
            defprop.putAll(th);
            changedprop.putAll(th);
            
            defprop.save(out_def, "---Yorum Yok---");
            changedprop.save(out_chan, "---Yorum Yok---");
   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FProperties.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            in_def.close();
            out_def.close();
            in_chan.close();
            out_chan.close();
        }        
    }
   
    public void setChangedProp(GenericData[] gd_keys, GenericData[] gd_values) throws IOException, FileNotFoundException{
        
        GenericKeyValue<GenericData> obj=new GenericKeyValue<GenericData>(gd_keys,gd_values);
        Hashtable th= obj.getHashtable();
                
        FileInputStream in = null;
        FileOutputStream out=null;
        try {
            in = new FileInputStream(chan_prop_filename);
            out=new FileOutputStream(chan_prop_filename);
            changedprop.load(in);
            changedprop.clear();
            changedprop.putAll(th);
            changedprop.save(out, "---Yorum Yok---");
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FProperties.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            in.close();
            out.close();
        }
    }
        
    public void addToChangedProp(GenericData gd_key, GenericData gd_value) throws IOException, FileNotFoundException{
        
        FileInputStream in = null;
        FileOutputStream out=null;
        try {
            in = new FileInputStream(chan_prop_filename);
            out=new FileOutputStream(chan_prop_filename);
            changedprop.load(in);
            changedprop.put(gd_key, gd_value);
            changedprop.save(out, "---Yorum Yok---");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FProperties.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            in.close();
            out.close();
        }
    }
    
    public void setDefaultProp(GenericData gd_keys[], GenericData gd_values[]) throws IOException, FileNotFoundException{

        GenericKeyValue<GenericData> obj=new GenericKeyValue<GenericData>(gd_keys,gd_values);
        Hashtable th= obj.getHashtable();
        
        FileInputStream in = null;
        FileOutputStream out=null;
        try {
            in = new FileInputStream(def_prop_filename);
            out=new FileOutputStream(def_prop_filename);
            defprop.load(in);
            defprop.clear();
            defprop.putAll(th);
            defprop.save(out, "---Yorum Yok---");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FProperties.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            in.close();
            out.close();
        }
    }
    
    public void addToDefaultProp(GenericData gd_key, GenericData gd_value) throws IOException, FileNotFoundException{

        FileInputStream in = null;
        FileOutputStream out=null;
        try {
            in = new FileInputStream(def_prop_filename);
            out=new FileOutputStream(def_prop_filename);
            defprop.load(in);
            changedprop.put(gd_key, gd_value);
            defprop.save(out, "---Yorum Yok---");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FProperties.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            in.close();
            out.close();
        }
    }
    
    public Properties getDefaultProperties(){
        return defprop;
    }
    
    public Properties getChangedProperties(){
        return changedprop;
    }
}