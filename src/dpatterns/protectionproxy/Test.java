/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.protectionproxy;

import java.lang.reflect.Proxy;

/**
 *
 * @author Suleyman
 */
public class Test {
        
        public static void main(String[] args) throws Exception{
            Test test=new Test();
            test.start();
        }
        
    public void start() throws Exception{
        BankaHesabi hesap=new BankaHesabiImp("Ahmet","Yildirim",1000);
        BankaHesabi kendiHesabimProxy=getKendiHesabimProxy(hesap);
        
        kendiHesabimProxy.paraYatir(2000);
        kendiHesabimProxy.paraCek(100);
        
        System.out.println("Hesaptaki para miktari: "+kendiHesabimProxy.getHesapDurumu());
        
        BankaHesabi baskaHesapProxy=getBaskaHesapProxy(hesap);
        
        baskaHesapProxy.paraYatir(400);
        baskaHesapProxy.paraCek(100);
        
        System.out.println("Baska hesaptaki para miktari: "+baskaHesapProxy.getHesapDurumu());
    }
    
    protected BankaHesabi getKendiHesabimProxy(BankaHesabi hesap){
        return (BankaHesabi) Proxy.newProxyInstance(
                hesap.getClass().getClassLoader(), 
                hesap.getClass().getInterfaces(), 
                new KendiHesabimInvocationHandler(hesap));
    }
    
    protected BankaHesabi getBaskaHesapProxy(BankaHesabi hesap){
        return (BankaHesabi) Proxy.newProxyInstance(
                hesap.getClass().getClassLoader(), 
                hesap.getClass().getInterfaces(), 
                new BaskaBirHesapInvocationHandler(hesap));
    }
}