import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna minulle ensimmainen luku.");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Anna minulle toinen luku");
        int toinen = Integer.valueOf(lukija.nextLine());

        int summa = eka + toinen;

        if (summa == 10) {
            System.out.println("Se oli kymppi");
        } else {
            System.out.println("Se ei ollut kymppi");
        }
    }
}