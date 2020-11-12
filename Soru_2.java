/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru_2;

/**
 *
 * @author Fatma
 */
public class Soru_2 {

   
    public static void main(String[] args) {
        
        Soru2_Araba araba1 = new Araba("Mercedes", "CLA180", "Kırmızı", 2010);
        Soru2_Araba araba2 = new Araba();
        araba2.setMarka("BMW");
        araba2.setModel("S20D");
        araba2.setRenk("Beyaz");
        araba2.setUretimYili(2015);
        System.out.println("Araba 1 : " + araba1);
        System.out.println("Araba 2 : " + araba2);

    }
    
}
