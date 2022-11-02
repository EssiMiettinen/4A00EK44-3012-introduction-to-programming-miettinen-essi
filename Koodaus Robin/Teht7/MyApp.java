import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int tulos = 0;

        System.out.println("Anna minulle luku");
        int luku1 = Integer.valueOf(lukija.nextLine());

        int i = 0;
        while (i < luku1) {
            tulos += 1;
            i++;
            System.out.println(tulos);
        }
    }
}