/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpatterns.protectionproxy;

/**
 *
 * @author Suleyman
 */
public class BankaHesabiImp implements BankaHesabi{
    
    private String isim;
    private String soyad;
    private int hesapDurumu=0;
    private boolean iptalEdildi=false;

    public BankaHesabiImp(String isim, String soyad, int miktar){
        setIsim(isim);
        setSoyad(soyad);
        setHesapDurumu(miktar);
    }
    
    public BankaHesabiImp(){
    }
    
    @Override
    public int paraCek(int miktar) throws Exception {
        
        if(getHesapDurumu()-miktar > 0){
            setHesapDurumu(getHesapDurumu()-miktar);
        }else{
            throw new Exception("Hesabinizda yeterli bakiye bulunmamaktadir.");
        }        
        return miktar;
    }

    @Override
    public void paraYatir(int miktar) {
        setHesapDurumu(getHesapDurumu()+miktar);
    }

    @Override
    public String getIsim() {
        return isim;
    }

    @Override
    public void setIsim(String isim) {
        this.isim=isim;
    }

    @Override
    public String getSoyad() {
        return soyad;
    }

    @Override
    public void setSoyad(String soyad) {
        this.soyad=soyad;
    }

    @Override
    public int getHesapDurumu() {
        return hesapDurumu;
    }

    @Override
    public void setHesapDurumu(int hesapDurumu) {
        this.hesapDurumu=hesapDurumu;
    }

    @Override
    public boolean iptalEt() {
        setIptalEdildi(true);
        return isIptalEdildi();
    }
    
    public void setIptalEdildi(boolean iptalEdildi){
        this.iptalEdildi=iptalEdildi;
    }
    
    public boolean isIptalEdildi(){
        return iptalEdildi;
    }
}