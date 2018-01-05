/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Suleyman
 * Processing with ResultSet and
 * Return it as ResultSet or Vector
 */

public class DBQuery extends DBStatement {    
        public ResultSet _sonuclar;
        Vector sonuclar=new Vector();
        
    public DBQuery(String host, String uName, String uPass){
        super.host=host;
        super.uName=uName;
        super.uPass=uPass;    
    }
    
    public void execProcedure(String sql_procedure,SQLType type) throws SQLException{
        sonuclar.clear();
        if(type.equals(null)){
            _sonuclar=super.exprocedure(sql_procedure);
                while(_sonuclar.next()){
                    sonuclar.add(_sonuclar);
                    }
            //return _sonuclar;
        }else{
            _sonuclar=super.exprocedure(sql_procedure,type);
                 while(_sonuclar.next()){
                    sonuclar.add(_sonuclar);
                     }
            //return _sonuclar;
        }
    }
    
    public void execSql(String sql) throws SQLException{
        sonuclar.clear();
        _sonuclar=super.exquery(sql);
                while(_sonuclar.next()){
                    sonuclar.add(_sonuclar);
    }
            //return _sonuclar;
    }

    
    public void execQueryForXMLFile(String SQL) throws SQLException, IOException{
        Statement stmt=null;
        stmt=super.con.createStatement();
        _sonuclar = stmt.executeQuery (SQL);
      // Get the first row
      if (_sonuclar.next ()){
         //Retrieve data from input stream
         InputStream xmlInputStream = _sonuclar.getAsciiStream (1);
         int c;
         ByteArrayOutputStream bos = new ByteArrayOutputStream();
         while (( c = xmlInputStream.read ()) != -1)
            bos.write(c);
            sonuclar.add(bos.toString());
         //Print results
         //System.out.println(bos.toString());
    }
    }
    
    public void endConnection() throws SQLException{
        super.closeConnection();
    }
        
    public ResultSet getSonuclarResultSet(){
        return _sonuclar;
    }
    //Vector olarak almak en mantikisi
    public Vector getSonuclarVector() throws SQLException{
    _sonuclar.close();
    return sonuclar;
}    
}