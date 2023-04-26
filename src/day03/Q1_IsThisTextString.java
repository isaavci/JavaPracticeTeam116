package day03;

import java.util.Scanner;

public class Q1_IsThisTextString {

        // Kullanicidan alinan karekterlerin string olup olmadigini
        // kontrol eden bir java program yaziniz


        static Scanner scanner=new Scanner(System.in);

        public static void isthisString(){
            System.out.println("Please input a string text");
            //Kullanici int giris yapabilir

            if (scanner.hasNextInt()){
                int input=scanner.nextInt();
                System.out.println("This is an integer input : "+ input);
                isthisString();
            }


        }










}
