/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru_1;

/**
 *
 * @author Fatma
 */
public class Soru_1 {

    /**
     * @param args the command line arguments
     */
    // hocam zaten bu sayılarn obeblerini aldığımız vakit 2000' den büyük çıkacaktır
    //OBEB(3,5,7,53)=5565
    //bu aralıkta bunları bölen 0rtak bir sayı olmadığı için sonuc sıfır çıkacaktır
    // Ama 5565 veya 10000 yaparsak doğru bir sonuc alabiliriz.
    public static void main(String[] args) {
        int toplam=0 , sayac=0 , sonuc ;
        for(int i=0; i<=2000; i++){
        if((i%3==0) && (i%5==0) && (i%7==0) && (i%53==0)){
                toplam+=i;
                sayac++;
            }
        }
        sonuc=toplam/sayac;
        System.out.println("Ağırlıklı ortalama : " + sonuc);
        
        
    }
    
}
