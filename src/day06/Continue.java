package day06;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + "");
        }
        System.out.println("");
        System.err.println("İşlem tamam");
    }
}