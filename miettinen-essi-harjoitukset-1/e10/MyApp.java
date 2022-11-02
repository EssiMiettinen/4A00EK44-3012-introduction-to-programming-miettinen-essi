import java.io.Console;  

public class MyApp {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Sano luku?");
        int luku = Integer.parseInt(c.readLine());
        
        int i = 0;
        while(i < luku) {
            System.out.println("Hellurei");
            i = i + 1;
        }
    }
}