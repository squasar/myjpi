/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.flyweight;

import java.util.ArrayList;

/**
 *
 * @author Suleyman
 */
public class HarfManager {
    
    private static final HarfManager manager=new HarfManager();
    
    private ArrayList<Harf> harfList=new ArrayList<Harf>();
    
    private Harf[][] document = new Harf[50][50];
    
    public HarfManager(){
        
    }
    
    public static final HarfManager instance(){
        return manager;
    }
    
    public static Harf getHarf(String h){
        
        Harf harf=null;
        for(int i=0; i<manager.harfList.size();i++){
            Harf temp=manager.harfList.get(i);
            if(temp.getHarf().equals(h)){
                harf=temp;
                break;
            }
        }
        if(harf==null){
                harf=new Harf(h);
                manager.harfList.add(harf);
            }
        return harf;
    }
    
    public void addSatir(String satir,int satirNo){
        for(int i=0;i<satir.length();i++){
            String harf=satir.substring(i,i+1);
            document[satirNo][i]=getHarf(harf);
        }
    }
    
    public static void getDokument(){
        for(int x=0;x<50;x++){
            for(int y=0;y<50;y++){
                if(manager.document[x][y] !=null){
                    System.out.print((manager.document[x][y]).getHarf());
                }
                else break;
            }
            if(manager.document[x][0] !=null){
                System.out.println("");
            }
        }
    }
    
    public ArrayList<Harf> getHarfList(){
        return harfList;
    }
    
    public void setHarfList(ArrayList<Harf> harfList){
        this.harfList=harfList;
    }
    
    public Harf[][] getDocument(){
        return document;
    }
    
    public void setDocument(Harf[][] document){
        this.document=document;
    }    
}