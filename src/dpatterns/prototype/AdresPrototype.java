/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.prototype;

/**
 *
 * @author Suleyman
 */
public abstract class AdresPrototype implements Cloneable {
    
    private String sokak;
    private String no;
    private String semt;
    private String sehir;
    
    public Object clone() throws CloneNotSupportedException{
        return (Object)super.clone();
    }
    
    public void setSokak(String sokak){
        this.sokak=sokak;
    }
    
    public String getSokak(){
        return sokak;
    }
    
    public void setNo(String no){
        this.no=no;
    }
    
    public String getNo(){
        return no;
    }
    
    public void setSemt(String semt){
        this.semt=semt;
    }
    
    public String getSemt(){
        return semt;
    }
    
    public void setSehir(String sehir){
        this.sehir=sehir;
    }
    
    public String getSehir(){
        return sehir;
    }
    
    
    public void printAdres(){
        System.out.println("Sokak: "+getSokak());
        System.out.println("No: "+getNo());
        System.out.println("Semt: "+getSemt());
        System.out.println("Sehir: "+getSehir());        
        System.out.println("hashcode: "+this.hashCode());
    }
}