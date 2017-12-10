/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suleyman
 */
public class JFile {

    public void readAFile(String filename) throws IOException{
        FileInputStream f_in = null;
        int sayac;
        try {
            f_in=new FileInputStream(filename);
            do{
                sayac=f_in.read();
                if(sayac != -1) System.out.print((char) sayac);
            }while(sayac != -1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Flow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Flow.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
            if(f_in != null){f_in.close();}
            }catch(IOException e){
                System.out.println("Dosya Kapatilmadi");
            }
        }
    }
    
    public void writeToAFile(String filename, String record){
        PrintWriter writer=null;
        try {
            writer = new PrintWriter(filename,"UTF-8" );
            writer.println(record);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Flow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Flow.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        writer.close();
        }
    }
    
    public void deleteAFile(String filename_path){
        try{
                File file = new File(filename_path);
    		if(file.delete()){
    			System.out.println(file.getName() + " Silindi!");
    		}else{
    			System.out.println("Dosya Silinemedi.");
                }
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}