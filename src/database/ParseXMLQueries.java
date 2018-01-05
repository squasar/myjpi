/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Suleyman
 */
public class ParseXMLQueries extends DefaultHandler {
                        
    int id ;
    String sql;
    String purpose;
    
    ParseXMLQueries(int id){
        this.id=id;
    }
                        public void startElement(String uri, 
                        String localName, String qName, Attributes attributes) throws SAXException {
                        
                            if (qName.equalsIgnoreCase("query")) {
                              if(Integer.parseInt(attributes.getValue("id"))==id){
                                id= Integer.parseInt(attributes.getValue("id"));
                                sql=attributes.getValue("value");
                                purpose=attributes.getValue("purpose");
                              System.out.println("ID : " + id);
                              System.out.println("QUERY : " + sql);
                              System.out.println("PURPOSE : " + purpose);
                              }
                        }
                }
                @Override
                public void endElement(String uri, 
                String localName, String qName) throws SAXException {
                    if (qName.equalsIgnoreCase("query")) {
                        System.out.println("End Element :" + qName);
                }
                }
                
        public int get_id(){
            return id;
        }
        public String get_sql(){
            return sql;
        }
        public String get_purpose(){
            return purpose;
        }
}