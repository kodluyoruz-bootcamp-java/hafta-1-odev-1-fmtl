/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru_2;

public class Araba {
    private String marka;
    private String model;
    private String renk;
    private int uretimYili;

    public Araba() {
    }

    public Araba(String marka, String model, String renk, int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.uretimYili = uretimYili;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    @Override
    public String toString() {
        return "Marka: " + getMarka() + ", Model: " + getModel() + ", Renk: " + getRenk() + ", Üretim yılı:" + getUretimYili();
    }
    
    
}
