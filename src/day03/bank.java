package day03;

import java.util.Scanner;

public class bank {
    /*
Bir Java ATM programi yaziniz asagidaki kurallara gore;
1-Kullaniciyi karsilayan bir method yazin ve yapmak istedigi islemleri sorun
2-Kullanici Bakiyesini ggorebilmesi icin method yaziniz
3-Kullanici Deposito yatirabilsin
4-Kullanici Para cekebilsin
5-Kullanici Cikis yapsin
 */
    static Scanner scanner=new Scanner(System.in);
    static double balance=5000;
    static double deposit;
    static int paraCekme;
    static int numberOfTransaction;

    public static void welcomeToBank(){
        System.out.println("******WELCOME TO BANK OF SLOVENIA******");
        System.out.println("Please Select Your Transaction");
        System.out.println("1-Balance\n2-Deposit\n3-Withdraw\n4-Exit");
        numberOfTransaction=scanner.nextInt();
        if (numberOfTransaction>=5 ||numberOfTransaction<1){
            System.out.println("Wrong Input...");
            welcomeToBank();
        }
        System.out.println();
    }

    public static void balanceLearning(){
        System.out.println("Your Balance is :"+ balance);
    }
    public static void depositAmount(){
        System.out.println("Please ");
    }




}
