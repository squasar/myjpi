/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author Suleyman
 */
public class BaskaBirHesapInvocationHandler implements InvocationHandler {

    private BankaHesabi hesap;
    
    public BaskaBirHesapInvocationHandler(BankaHesabi bh){
        setHesap(bh);
    }

    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try{
            if(method.getName().startsWith("paraYatir")){
                return method.invoke(getHesap(),args);
            }
            else if(method.getName().startsWith("paraCek")){
                throw new Exception("Baska bir hesaptan para cekemezsiniz...");
            }
            else if(method.getName().startsWith("get")){
                return method.invoke(getHesap(),args);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public BankaHesabi getHesap(){
        return hesap;
    }
    
    public void setHesap(BankaHesabi hesap){
        this.hesap=hesap;
    }    
}