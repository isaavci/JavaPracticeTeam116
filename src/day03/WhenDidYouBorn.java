package day03;

import java.util.Scanner;

public class WhenDidYouBorn {

    // Kullaniciya hangi ayda dogdunu sorun ve
// dogdugu ayin Hangi mevsim oldugunu veren bir java program yaziniz

    static Scanner scanner=new Scanner(System.in);
    static String month;
    static String season;
    static String january="january";
    static String february="february";
    static String march="march";
    static String april="april";
    static String may="may";
    static String june="june";
    static String july="july";
    static String august="august";
    static String september="september";
    static String october="october";
    static String november="november";
    static String december="decenber";

    public static void birthDay(){
        System.out.println("Please enter the month you born in");
        month=scanner.next();
        String January = null;
        if (month.equalsIgnoreCase(January) || month.equalsIgnoreCase(february)||
        month.equalsIgnoreCase(december)){
            season="Winter";
        } else if (month.equalsIgnoreCase(july) || month.equalsIgnoreCase(july)||
                month.equalsIgnoreCase(august)){
            season="Summer";
        } else if (month.equalsIgnoreCase(september) || month.equalsIgnoreCase(october)||
                month.equalsIgnoreCase(november)){
            season="Autumn";
        }

    }

}
