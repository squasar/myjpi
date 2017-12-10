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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    public void makeDirectory(String f_path){
        Path p = Paths.get(f_path); //("C:\\Directory\\SubDir\\SubDir2");
        if (!Files.exists(p)) {
            try {
                Files.createDirectories(p);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
    }
    public void deleteDirectory(String f_path){//Denenmeli
        Path p = Paths.get(f_path); //("C:\\Directory\\SubDir\\SubDir2");
        if (!Files.exists(p)) {
            try {
                Files.delete(p);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
    }
    public void listAllFiles(String f_path){
        File folder = new File(f_path);//("dizin/yol");
        File[] listOfFiles = folder.listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                System.out.println("Dosya " + listOfFiles[i].getName());
                } else if (listOfFiles[i].isDirectory()) {
                  System.out.println("Dizin " + listOfFiles[i].getName());
                    }
            }
    }
    //kopyalama ve tasima islemleri
    //parse islemleri
    //sistem dosyalari ve uygulama dosyalariyla islemler
}