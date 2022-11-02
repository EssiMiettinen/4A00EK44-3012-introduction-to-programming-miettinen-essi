import java.io.Console;  

public class MyApp {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Mitä kello on tunneissa?");
        int h = Integer.parseInt(c.readLine());

        System.out.println("Mitä kello on minuuteissa?");
        int min = Integer.parseInt(c.readLine());

        System.out.println("Paljon sinulla on rahaa?");
        int euro = Integer.parseInt(c.readLine());

        if (h == 3 && min == 29 && euro == 5) {
           System.out.println("Alepub on auki klo 12 - 3.29 joka päivä ja oluen hinta on 5 euroa. Mene Alepubiin."); 
        }
    }
}