/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suleyman
 * 
 * Veritabani baglanti ayarlari yapilacaktir.
 * 
 * http://www.homeandlearn.co.uk/java/connecting_to_a_database_table.html
 * https://www.tutorialspoint.com/jdbc/jdbc-result-sets.htm
*/


public class DBConnect {
        
    protected Connection con;
    public String host;
    public String uName;
    public String uPass;
    
    //setters
    
    public void DBConnect(String host,String uName,String uPass){
        this.host=host;
        this.uName=uName;
        this.uPass=uPass;
        connect();
    }
    public void closeConnection() throws SQLException{
        close_connection();
    } 
//    
//
//
    //EX: String host = "jdbc:derby://localhost:1527/Employees";
    private void connect(){
    
        try {
            con=DriverManager.getConnection(host,uName,uPass);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    private void close_connection() throws SQLException{
        con.close();
        DriverManager.getConnection(host).close();
    }
}