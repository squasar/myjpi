/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.strategy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 *
 * @author Suleyman
 */
public class BeanToFileStrategy implements Strategy {

    @Override
    public void save(Bean bean) {
        try{
            StringBuilder temp=new StringBuilder();
            temp.append("counter: ")
                    .append(bean.getCounter())
                    .append("\n");
            
            temp.append("name: ")
                    .append(bean.getName())
                    .append("\n");
            
            File file=new File("C:/temp/bean.txt");
            
            if(file.exists()){
                file.delete();
                file=new File("C:/temp/bean.txt");
            }
            
            Writer output=null;
            try{
                output=new BufferedWriter(new FileWriter(file));
                output.write(temp.toString());
            }finally{
                if(output != null){
                    output.close();
                }
            }
            System.out.println("bean.txt olusturuldu...");
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }    
}