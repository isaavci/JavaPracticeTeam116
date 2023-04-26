package day02;

import java.util.Scanner;

public class Q2_HesapMakinesi {
    public static void main(String[] args) {

        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int a=scanner.nextInt();
        System.out.println("Lütfen 2. tamsayiyi giriniz");
        int b=scanner.nextInt();
        System.out.println("Lütfen İşlem numarası giriniz :" +
                "\n\t1: Toplama, \n\t2: Cıkarma, \n\t3: Carpma, \n\t4: Bolme");

        int islem=scanner.nextInt();

        if (islem==1) System.out.println(a+b);
        else if (islem==2) System.out.println(a-b);
        else if (islem==3) System.out.println(a*b);
        else if (islem==4){
            if (b==0) System.out.println("0'a bölüm tanimsizdir");
             else System.out.println(a/b);}
        else System.out.println("Yanlıs giris yaptınız.Lütfen tekrar deneyiniz");

        System.out.println("*****************Swich Case Cözümü******************");

        switch (islem){
            case 1: System.out.println(a + "+"+b +"="+(a+b));break;
            case 2:System.out.println(a + "-"+b +"="+(a-b));break;
            case 3:System.out.println(a + "*"+b +"="+(a*b));break;
            case 4:System.out.println(a + "/"+b +"="+(a/b));break;
            default:System.out.println("Yanlıs giris yaptınız.Lütfen tekrar deneyiniz");}

        System.out.println("*****************Swich Case 2. Cözümü******************");

        switch (islem) {

            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case 4:
                if (b == 0) System.out.println("0'a bolum tanimsizdir!");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;

            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz!");

        }


        System.out.println("*********************SWITCH CASE 2 COZUMU************************");

        System.out.println("Islemini yapmak istediginiz issareti giriniz ");
        char isaret = scanner.next().charAt(0);

        switch (isaret) {

            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case '/':
                if (b == 0) System.out.println("0'a bolum tanimsizdir!");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;

            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz!");}







        }
}
