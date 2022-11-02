
import java.io.Console;

public class MyApp {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna sana:");
        String merkkijono = c.readLine();
        System.out.println("Alkuosan pituus:");
        int numero = Integer.parseInt(c.nextLine());

        char merkki = merkkijono.charAt(numero);
        System.out.println(merkki);
    }
}