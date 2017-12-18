/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suleyman
 * 
 * 
 * 
 */
public class DBStatement extends DBConnect {
        
    public ResultSet sonuc;
        
    public ResultSet exquery(String SQL) throws SQLException{
    
        PreparedStatement pstmt = null;
        //ResultSet res=null;
        try {
            pstmt=super.con.prepareStatement(SQL,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sonuc = pstmt.executeQuery(SQL);   
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            pstmt.close();
        }    
    return sonuc;
    }

    public void createXMLTableOnDataBase(String xmlFileNameAndPath) throws SQLException, FileNotFoundException, IOException{
   
   PreparedStatement pstmt=null;     
   Statement stmt=null;
    //Create SQL Statement
   String streamingDataSql = "CREATE TABLE XML_Data " +
                             "(id INTEGER, Data LONG)";
   String SQL = "INSERT INTO XML_Data VALUES (?,?)";
   //Open FileInputStream
   File f = new File(xmlFileNameAndPath);
      long fileLength = f.length();
      FileInputStream fis = new FileInputStream(f);
   try{
      stmt=super.con.createStatement();
      pstmt = super.con.prepareStatement(SQL);
      pstmt.setInt(1,100);
      pstmt.setAsciiStream(2,fis,(int)fileLength);
      pstmt.execute();
      
      //Drop table first if it exists.
      stmt.executeUpdate("DROP TABLE XML_Data");
      //Continue
      stmt.executeUpdate(streamingDataSql);
     // crXMLTable(stmt);
   }catch(SQLException se){
   }finally{
       stmt.close();
       pstmt.close();
       fis.close();
   }
   
   
}//end createXMLTable

    public ResultSet exprocedure(String procedure) throws SQLException{
        
        CallableStatement cstmt=null;
        //ResultSet res=null;
        try {
            cstmt=super.con.prepareCall(procedure,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sonuc=cstmt.executeQuery(procedure);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }finally
        {
            cstmt.close();
        }
        return sonuc;
    }
    
    public ResultSet exprocedure(String procedure,SQLType method) throws SQLException{
        
        CallableStatement cstmt=null;
        ResultSet res=null;
        try {
            cstmt=super.con.prepareCall(procedure,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            cstmt.registerOutParameter(procedure, method);
            res=cstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }finally
        {
            cstmt.close();
        }
        return res;
    }
}