import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna minulle kaksi numeroa");
        System.out.println("Ensin pieni numero ja sitten iso numero");
        int luku1 = Integer.valueOf(lukija.nextLine());
        int luku2 = Integer.valueOf(lukija.nextLine());

        for (int i=luku1; i<luku2; i++) {
            System.out.println(i);
        }
    }
}