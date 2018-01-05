/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;


/**
 *
 * @author Suleyman
 */
public class DBFace {

      DBQuery query;
      
      //EX: String host = "jdbc:derby://localhost:1527/Employees";
      DBFace(String host, String uName, String uPass){
        query=new DBQuery(host ,uName, uPass);
      }
      public void exec_sql_query(int id){
          saxParse("mqueries.xml",id);
      }
      
      public void exec_sql_query(String sql) throws SQLException{
          query.execSql(sql);
      }
      
      public DBQuery getQuery(){
          return query;
      }
      
      public void saxParse(String filename, int id){
            File inputFile = new File(filename);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser;
        try {
            saxParser = factory.newSAXParser();
            ParseXMLQueries userhandler = new ParseXMLQueries(id);
            saxParser.parse(inputFile, userhandler);
            
            //Results
            query.exquery(userhandler.get_sql());

        } catch (ParserConfigurationException ex) {
        } catch (SAXException ex) {
        } catch (IOException ex) {
              Logger.getLogger(DBFace.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(DBFace.class.getName()).log(Level.SEVERE, null, ex);
          }
      
      }
      
      public void closeConnection() throws SQLException{
          query.endConnection();
      }
    
}