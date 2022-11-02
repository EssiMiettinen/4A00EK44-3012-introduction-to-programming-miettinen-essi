import java.io.Console;  

public class MyApp {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna päivä");
        int day = Integer.parseInt(c.readLine());

        System.out.println("Anna kuukausi");
        int month = Integer.parseInt(c.readLine());

        if (day == 24 && month == 12) {
           System.out.println("Hyvää Joulua!"); 
        }
    }
}