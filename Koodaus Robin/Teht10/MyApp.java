import java.util.Scanner;

//Puuttuu javadoc ja generoi javadoc selitykset.
public class MyApp {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka monta tulostan?");
        int maara = Integer.valueOf(lukija.nextLine());
        printText(maara);
    }
    public static void printText(int maara) {
        int i = 0;
        while (i < maara) {
            System.out.println("Essi");
            i++;
        }
    }
}