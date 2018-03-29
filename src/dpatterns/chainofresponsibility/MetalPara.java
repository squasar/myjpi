/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.chainofresponsibility;

import java.util.ArrayList;

/**
 *
 * @author Suleyman
 */
public abstract class MetalPara {
    
    private ArrayList metalParaListesi=new ArrayList();    
    private int value;    
    private MetalPara next;
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value=value;
    }
    
    public MetalPara getNext(){
        return next;
    }
    
    public MetalPara setNext(MetalPara next){
        this.next=next;
        return this;
    }
    
    public void check(MetalPara para){
        System.out.println("Siradaki nesne sadece "+this+" isleyebilir...");
        if(para.getValue() != this.value){
            System.out.println("Uymadi! Zincirdeki bir sonraki nesneye iletiyoruz...");
            if(getNext() != null){
                getNext().check(para);
            }else{
                System.out.println("Zincirin sonundayiz. Metal para "+
                        para.toString()+" bu otomat icin uygun degildir...");
            }
        }else{
            metalParaListesi.add(para);
            System.out.println("Otomat tarafindan "+para.toString()+" kabul edildi...");
        }
    }
    
}
