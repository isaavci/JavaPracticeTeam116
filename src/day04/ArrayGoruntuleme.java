package day04;

import java.util.Scanner;

public class ArrayGoruntuleme {

    static int size;
    static Scanner scanner=new Scanner(System.in);

    public static void printArrayMethod(){

        System.out.println("Lütfen Array in size ini belirtin...");
        size=scanner.nextInt();
        int[] ogrencilerinYaslari=new int[size];

        System.out.println("Lutfen ogrencilerin yaslarını girin ");
        for (int i = 0; i < size; i++) {
            System.out.println(i+1+".Veri");
            ogrencilerinYaslari[i]=scanner.nextInt();
        }

        System.out.println("Olusturulan array icerisindeki verilerin ciktisi...");
        for (int i = 0; i < size; i++) {
            System.out.println(ogrencilerinYaslari[i]+" ");
        }

    }

    public static void main(String[] args) {
        printArrayMethod();

    }



}

