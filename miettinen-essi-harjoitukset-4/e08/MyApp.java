import java.io.Console;

public class MyApp {
    public static void main(String [] args) {
        Console c = System.console();

        int [] taulukko = new int[10];
        int tulos = 0;

        System.out.println("Anna minulle kymmenen kokonaisluku.");

        for(int i = 0; i < taulukko.length; i++) {
            taulukko [i] = Integer.parseInt(c.readLine());
        }
            for(int summa = 0; summa < taulukko.length; summa++) {
                tulos = tulos + taulukko[summa];
            }
            System.out.println(tulos);
    }
}