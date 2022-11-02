import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Ensin leveys.");
        int width = Integer.valueOf(lukija.nextLine());
        System.out.println("Sitten korkeus.");
        int heigth = Integer.valueOf(lukija.nextLine());
        printRectangle(width, heigth);
    }

    /*
       *****
       *****
       *****
       *****
       *****

    */
    public static void printRectangle(int width, int heigth) {
        for (int i=0; i<heigth; i++) {
            printStars(width);
            System.out.println();
        }
    }
    
    
    // ********
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
    }
}