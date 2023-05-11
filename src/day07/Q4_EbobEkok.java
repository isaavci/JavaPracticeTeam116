package day07;

import java.util.Scanner;

public class Q4_EbobEkok {
    // Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

    // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.

    public static void main(String[] args) {

        int sayi1=4;

        int sayi2=6;

        int kucuksayi=0;
        int buyuksayi=0;

        if (sayi1<sayi2){
            kucuksayi=sayi1;
            buyuksayi=sayi2;
        }else
            kucuksayi=sayi2;
            buyuksayi=sayi1;

        for (int i = kucuksayi; i >1 ; i--) {
            if (sayi1%i==0 && sayi2%i==0){
                System.out.println("Sayilarin EBOB'u : " + i);
                break;
            }
            
        }
        for (int i = buyuksayi; i <= sayi1*sayi2 ; i++) {

            if ( i % sayi1 == 0 && i % sayi2 == 0 ) {

                System.out.println("Sayilarin EKOK'u = " + i);
                break;
            }
        }
            









    }








}
