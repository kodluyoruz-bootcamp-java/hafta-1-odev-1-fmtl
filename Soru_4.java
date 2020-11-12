/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru_4;

import java.util.Scanner;

/**
 *
 * @author Fatma
 */
public class Soru_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen ondalıklı bir sayı girin :");

        double sayi = sc.nextDouble();
        System.out.println("Sayı :" + sayi);
        System.out.println("Aşağı yuvarlamak için 0'ı yukarı yuvarlamak için 1'i tıklayınız ");
        int yuvarla = sc.nextInt();

        if (yuvarla == 0) {
            System.out.println("Sayının en yakın sayıya yuvarlanmış hali : " + Math.floor(sayi));

        } else if (yuvarla == 1) {
            System.out.println("Sayının en yakın sayıya yuvarlanmış hali : " + Math.ceil(sayi));

        }

    }

}
