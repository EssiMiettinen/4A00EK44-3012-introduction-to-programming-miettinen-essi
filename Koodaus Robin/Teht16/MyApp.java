import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna taulukolle koko.");
        int numero = Integer.valueOf(lukija.nextLine());
        int[] taulukko = new int[numero];
    }
}