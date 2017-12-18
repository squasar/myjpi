/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.SQLException;
import streams.JFile;


/**
 *
 * @author Suleyman
 */
public class DBFace {

      JFile j_file;  
      DBQuery query;
      
      //EX: String host = "jdbc:derby://localhost:1527/Employees";
      DBFace(String host, String uName, String uPass, String xml_filename, String xml_filepath){
        j_file=new JFile(xml_filename,xml_filepath);
        query=new DBQuery(host ,uName, uPass);
      }
    
    //Sorgular XML dosyasinda tutulacagindan;
    //XML dosyasinin yapisini olustur.
    //XML dosyasina parse islemini yap.(JFile daki parse metodlarini bu ornege gore tekrar sekillendir.)
    //DBQuery nesnesini parse edilecek olan Xml dosyasindaki sorgular icin hazir hale getir.
    //Ve...  
      
      public void closeConnection() throws SQLException{
          query.endConnection();
      }
    
}