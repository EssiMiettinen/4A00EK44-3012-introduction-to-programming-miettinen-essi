import java.io.Console;  

public class MyApp {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna luku");
        int luku = Integer.parseInt(c.readLine());

        System.out.println("Anna toinen luku");
        int luku2 = Integer.parseInt(c.readLine());

        if(luku < luku2) {
            System.out.println(luku2);
        } else if(luku > luku2) {
            System.out.println(luku);
        }
    }
}