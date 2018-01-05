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
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Suleyman
 */
public class JFile {
    
    String file_name;
    String file_path;
    
    public JFile(String fileName, String filePath){
        file_name=fileName;
        file_path=filePath;
    }
    
    public JFile(String filename){
        file_name=filename;
    }
    
    public void readAFile() throws IOException{
        FileInputStream f_in = null;
        int sayac;
        try {
            f_in=new FileInputStream(file_name);
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
    
    public void writeToAFile(String record){
        PrintWriter writer=null;
        try {
            writer = new PrintWriter(file_name,"UTF-8" );
            writer.println(record);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Flow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Flow.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        writer.close();
        }
    }
    public void deleteAFile(){
        try{
                File file = new File(file_path);
    		if(file.delete()){
    			System.out.println(file.getName() + " Silindi!");
    		}else{
    			System.out.println("Dosya Silinemedi.");
                }
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    public void makeDirectory(){
        Path p = Paths.get(file_path); //("C:\\Directory\\SubDir\\SubDir2");
        if (!Files.exists(p)) {
            try {
                Files.createDirectories(p);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
    }
    public void deleteDirectory(){//Denenmeli
        Path p = Paths.get(file_path); //("C:\\Directory\\SubDir\\SubDir2");
        if (!Files.exists(p)) {
            try {
                Files.delete(p);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
    }
    public void listAllFiles(){
        File folder = new File(file_path);//("dizin/yol");
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
    public void copyAFile(String source, String target){
        Path path = FileSystems.getDefault().getPath(source);
        Path path1 = FileSystems.getDefault().getPath(target);
            try {
                Files.copy(path, path1, REPLACE_EXISTING);
            } catch (IOException ex) {
                Logger.getLogger(JFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void moveAFile(String source, String target){
        Path path = FileSystems.getDefault().getPath(source);
        Path path1 = FileSystems.getDefault().getPath(target);
            try {
                Files.move(path, path1, REPLACE_EXISTING);
            } catch (IOException ex) {
                Logger.getLogger(JFile.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 
    
    
        //parse islemleri
    public void domParse(String elementsByTagName){
            try {
                File inputFile = new File(file_name);
                //f_name="abc.xml"
                //elementsByTagName="liste içindeki itemlerin ismi"
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(inputFile);
                doc.getDocumentElement().normalize();
                System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
                NodeList nList = doc.getElementsByTagName(elementsByTagName);
                System.out.println("----------------------------");
                    for (int temp = 0; temp < nList.getLength(); temp++) {
                            Node nNode = nList.item(temp);
                            System.out.println("\nCurrent Element :" + nNode.getNodeName());
                                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                            Element eElement = (Element) nNode;
                                            System.out.println("Student roll no : " 
                                            + eElement.getAttribute("rollno"));
                                            System.out.println("First Name : " 
                                            + eElement
                                            .getElementsByTagName("firstname")
                                            .item(0)
                                            .getTextContent());
                                            System.out.println("Last Name : " 
                                            + eElement
                                            .getElementsByTagName("lastname")
                                            .item(0)
                                            .getTextContent());
                                            System.out.println("Nick Name : " 
                                            + eElement
                                            .getElementsByTagName("nickname")
                                            .item(0)
                                            .getTextContent());
                                            System.out.println("Marks : " 
                                            + eElement
                                            .getElementsByTagName("marks")
                                            .item(0)
                                            .getTextContent());
                                            }
                                            }
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                            }
                //Sax parsing example
                public class UserHandler extends DefaultHandler {
                    
                        boolean bFirstName = false;
                        boolean bLastName = false;
                        boolean bNickName = false;
                        boolean bMarks = false;

                        public void startElement(String uri, 
                        String localName, String qName, Attributes attributes) throws SAXException {
                    
                            if (qName.equalsIgnoreCase("student")) {
                                String rollNo = attributes.getValue("rollno");
                                System.out.println("Roll No : " + rollNo);
                        } else if (qName.equalsIgnoreCase("firstname")) {
                                bFirstName = true;
                        } else if (qName.equalsIgnoreCase("lastname")) {
                                bLastName = true;
                        } else if (qName.equalsIgnoreCase("nickname")) {
                                bNickName = true;
                        }
                        else if (qName.equalsIgnoreCase("marks")) {
                                bMarks = true;
                        }
                }
                @Override
                public void endElement(String uri, 
                String localName, String qName) throws SAXException {
                
                    if (qName.equalsIgnoreCase("student")) {
                        System.out.println("End Element :" + qName);
                }
                }
                
                @Override
                public void characters(char ch[], int start, int length) throws SAXException {
                
                    if (bFirstName) {
                        System.out.println("First Name: " 
                        + new String(ch, start, length));
                        bFirstName = false;
                } else if (bLastName) {
                        System.out.println("Last Name: " + new String(ch, start, length));
                        bLastName = false;
                } else if (bNickName) {
                        System.out.println("Nick Name: " + new String(ch, start, length));
                        bNickName = false;
                } else if (bMarks) {
                        System.out.println("Marks: " + new String(ch, start, length));
                        bMarks = false;
                }
                }
                }
        
    public void saxParse(){ 
        try {
            File inputFile = new File(file_name);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler userhandler = new UserHandler();
            saxParser.parse(inputFile, userhandler); 
            
        } catch (Exception e) {
        e.printStackTrace();
        }
        }
}