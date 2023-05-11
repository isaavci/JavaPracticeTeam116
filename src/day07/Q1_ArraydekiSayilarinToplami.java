package day07;

import java.util.Arrays;

public class Q1_ArraydekiSayilarinToplami {

    //Create an array of 5 floats and calculate their sum.
    //5 değişkenlik bir dizi oluşturun ve toplamlarını hesaplayın.

    public static void main(String[] args) {

        //float [] nubers =new float[5];
        float[] numbers = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        float toplam=0;

        System.out.println("************************For Loop Cuzumu*************************");

        for (int i = 0; i < numbers.length; i++) {
            toplam+=numbers[i];
        }
        System.out.println("Toplam forloop : "+ toplam);

        System.out.println("************************While Loop Cuzumu*************************");

        toplam=0;
        int i=0;

        while (i<numbers.length){

            toplam+=numbers[i];
            i++;
        }
        System.out.println("Toplam Whileloop : "+ toplam);

        System.out.println("************************While Loop Cuzumu 2*************************");

        toplam=0;
        int uzunluk=numbers.length-1;

        while (uzunluk>=0){

            toplam+=numbers[uzunluk];
            uzunluk--;
        }
        System.out.println("Toplam Whileloop 2 : "+ toplam);

        System.out.println("************************While Loop Cuzumu 3*************************");

        toplam=0;
        int ind=numbers.length;

        while (ind>0){

            toplam+=numbers[ind-1];
            ind--;
        }
        System.out.println("Toplam Whileloop 3 : "+ toplam);



    }


}
