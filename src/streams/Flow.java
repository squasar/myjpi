/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suleyman
 */
public class Flow {
    
    
    public GenericData serialize(String filename, GenericData gd){
        try(ObjectOutputStream objos=new ObjectOutputStream(new FileOutputStream(filename)))
        {
            objos.writeObject(gd);
            
             } catch (IOException ex) {
            Logger.getLogger(Flow.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gd;
    }
    
    
    public GenericData deserialize(String filename, GenericData gd){
        
        try(ObjectInputStream obins=new ObjectInputStream(new FileInputStream(filename))){
            
           gd=(GenericData)obins.readObject();
            
        } catch (IOException ex) {
            Logger.getLogger(Flow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Flow.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gd;
    }
    
}
