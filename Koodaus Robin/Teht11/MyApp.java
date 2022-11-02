import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka monta tulostan?");
        int amount = Integer.valueOf(lukija.nextLine());
        printStars(amount);
    }
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.println("*");
            i++;
        }
    }
}